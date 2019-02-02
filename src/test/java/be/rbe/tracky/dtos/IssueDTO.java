package be.rbe.tracky.dtos;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class IssueDTO {

    public String name;
    public String severity;
    public List<CommentDTO> comments;

    private IssueDTO(Builder builder) {
        this.name = builder.name;
        this.severity = builder.severity;
        this.comments = builder.comments;
    }

    public static Builder newIssueDTO() {
        return new Builder();
    }


    public static final class Builder {
        private String name;
        private String severity;
        private List<CommentDTO> comments;

        private Builder() {
        }

        public IssueDTO build() {
            return new IssueDTO(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        public Builder comments(List<CommentDTO> comments) {
            this.comments = comments;
            return this;
        }
    }
}
