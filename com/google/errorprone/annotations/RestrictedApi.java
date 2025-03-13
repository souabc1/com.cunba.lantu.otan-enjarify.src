package com.google.errorprone.annotations;

import java.lang.annotation.Annotation;

public @interface RestrictedApi
{
  String allowedOnPath();
  
  Class[] allowlistAnnotations();
  
  Class[] allowlistWithWarningAnnotations();
  
  String explanation();
  
  String link();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.errorprone.annotations.RestrictedApi
 * JD-Core Version:    0.7.0.1
 */