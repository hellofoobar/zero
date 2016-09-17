package robertli.zero.service;

import java.util.List;

/**
 * A EmailMessage is a message which can be send by EmailService.<br>
 * a email message includes a email list, a subject, and a content. Each email
 * has an UUID for identification.
 *
 * @version 1.0 2016-08-20
 * @author Robert Li
 */
public interface EmailMessage {

    public String getUUID();

    public List<String> getEmailList();

    public String getSubject();

    public String getContent();
}