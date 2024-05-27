package designPatterns.structural.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

import java.util.Base64;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message{
    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        //Be wary of charset!! This is platform dependent..
        return StringEscapeUtils.escapeHtml4( msg.getContent());
    }
}
