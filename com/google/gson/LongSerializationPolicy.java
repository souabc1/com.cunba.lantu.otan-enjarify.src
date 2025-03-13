package com.google.gson;

import m54207b69;

public enum LongSerializationPolicy
{
  static
  {
    LongSerializationPolicy.1 local1 = new com/google/gson/LongSerializationPolicy$1;
    Object localObject1 = m54207b69.F54207b69_11("'E01010507140E17");
    local1.<init>((String)localObject1, 0);
    DEFAULT = local1;
    localObject1 = new com/google/gson/LongSerializationPolicy$2;
    Object localObject2 = m54207b69.F54207b69_11("'\\0F0910181620");
    int i = 1;
    ((LongSerializationPolicy.2)localObject1).<init>((String)localObject2, i);
    STRING = (LongSerializationPolicy)localObject1;
    localObject2 = new LongSerializationPolicy[2];
    localObject2[0] = local1;
    localObject2[i] = localObject1;
    $VALUES = (LongSerializationPolicy[])localObject2;
  }
  
  public abstract JsonElement serialize(Long paramLong);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.LongSerializationPolicy
 * JD-Core Version:    0.7.0.1
 */