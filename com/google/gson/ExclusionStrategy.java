package com.google.gson;

public abstract interface ExclusionStrategy
{
  public abstract boolean shouldSkipClass(Class paramClass);
  
  public abstract boolean shouldSkipField(FieldAttributes paramFieldAttributes);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.ExclusionStrategy
 * JD-Core Version:    0.7.0.1
 */