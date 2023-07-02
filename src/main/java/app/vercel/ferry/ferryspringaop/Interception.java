package app.vercel.ferry.ferryspringaop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/************************
 * Made by [MR Ferry™]  *
 * on Juli 2023         *
 ************************/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Interception{
	String printValue();
}
