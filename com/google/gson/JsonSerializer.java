package com.google.gson;

import java.lang.reflect.Type;

public abstract interface JsonSerializer
{
  public abstract JsonElement serialize(Object paramObject, Type paramType, JsonSerializationContext paramJsonSerializationContext);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.JsonSerializer
 * JD-Core Version:    0.7.0.1
 */