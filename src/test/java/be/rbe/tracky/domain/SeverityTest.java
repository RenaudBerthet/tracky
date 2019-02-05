package be.rbe.tracky.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(Parameterized.class)
class SeverityTest {

    private static Stream<Arguments> createWords() {
        return Stream.of(
                Arguments.of("low", Severity.LOW),
                Arguments.of("LOW", Severity.LOW),
                Arguments.of("medium", Severity.MEDIUM),
                Arguments.of("MEDIUM", Severity.MEDIUM),
                Arguments.of("high", Severity.HIGH),
                Arguments.of("HIGH", Severity.HIGH),
                Arguments.of("critical", Severity.CRITICAL),
                Arguments.of("CRITICAL", Severity.CRITICAL)
        );
    }

    @Test
    void should_throw_an_exception_when_string_doesnt_match_an_accepted_value() {
        //given
        String ImpossibleString = "Not_ALLOWED";
        //when
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Severity.fromText(ImpossibleString);
                }
        );
    }

    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @MethodSource("createWords")
    void fromText(String givenString, Severity expectedSeverity) {
        Assertions.assertEquals(expectedSeverity, Severity.fromText(givenString));
    }

}