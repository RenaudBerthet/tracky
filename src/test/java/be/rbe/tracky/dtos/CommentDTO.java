package be.rbe.tracky.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CommentDTO {
    public String message;
    public String postedby;
    public String postedon;

    private CommentDTO(Builder builder) {
        this.message = builder.message;
        this.postedby = builder.postedby;
        this.postedon = builder.postedon;
    }

    public static Builder newCommentDTO() {
        return new Builder();
    }

    public static final class Builder {
        private String message;
        private String postedby;
        private String postedon;

        private Builder() {
        }

        public CommentDTO build() {
            return new CommentDTO(this);
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder postedby(String postedby) {
            this.postedby = postedby;
            return this;
        }

        public Builder postedon(String postedon) {
            this.postedon = postedon;
            return this;
        }
    }
}
