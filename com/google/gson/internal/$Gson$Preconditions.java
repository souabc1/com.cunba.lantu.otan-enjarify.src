package com.google.gson.internal;

public final class $Gson$Preconditions
{
  private $Gson$Preconditions()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static void checkArgument(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public static Object checkNotNull(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal..Gson.Preconditions
 * JD-Core Version:    0.7.0.1
 */