package com.google.errorprone.annotations;

import java.lang.annotation.Annotation;

public @interface RequiredModifiers
{
  Modifier[] modifier();
  
  javax.lang.model.element.Modifier[] value();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.errorprone.annotations.RequiredModifiers
 * JD-Core Version:    0.7.0.1
 */