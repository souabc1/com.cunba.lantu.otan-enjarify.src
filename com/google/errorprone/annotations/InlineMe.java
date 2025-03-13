package com.google.errorprone.annotations;

import java.lang.annotation.Annotation;

public @interface InlineMe
{
  String[] imports();
  
  String replacement();
  
  String[] staticImports();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.errorprone.annotations.InlineMe
 * JD-Core Version:    0.7.0.1
 */