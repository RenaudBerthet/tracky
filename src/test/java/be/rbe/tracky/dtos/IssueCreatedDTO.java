package be.rbe.tracky.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IssueCreatedDTO {

    @JsonProperty("_Link")
    String link;
}
