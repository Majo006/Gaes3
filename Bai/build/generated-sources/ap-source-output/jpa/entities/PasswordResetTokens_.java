package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-09-04T23:54:58")
@StaticMetamodel(PasswordResetTokens.class)
public class PasswordResetTokens_ { 

    public static volatile SingularAttribute<PasswordResetTokens, Date> createdAt;
    public static volatile SingularAttribute<PasswordResetTokens, String> email;
    public static volatile SingularAttribute<PasswordResetTokens, String> token;

}