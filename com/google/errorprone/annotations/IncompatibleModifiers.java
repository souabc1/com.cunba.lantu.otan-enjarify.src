package com.google.errorprone.annotations;

import java.lang.annotation.Annotation;

public @interface IncompatibleModifiers
{
  Modifier[] modifier();
  
  javax.lang.model.element.Modifier[] value();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.errorprone.annotations.IncompatibleModifiers
 * JD-Core Version:    0.7.0.1
 */