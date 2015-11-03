package br.univel.model.DBUtils.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 	Anotação para tratar as os atributos que representão colunas
 * no banco de dados, se o valor for vazio ele, o padrão será 
 * o nome do campo.
 * 
 * @author aureo
 * @since 29/10/2015 21:07
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Coluna {

	public String nome() default "";
}