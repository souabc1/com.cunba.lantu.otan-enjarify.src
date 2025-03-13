package com.xuexiang.xhttp2.cache.stategy;

import com.xuexiang.xhttp2.cache.RxCache;
import io.reactivex.Observable;
import java.lang.reflect.Type;

public abstract interface IStrategy
{
  public abstract Observable execute(RxCache paramRxCache, String paramString, long paramLong, Observable paramObservable, Type paramType);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.cache.stategy.IStrategy
 * JD-Core Version:    0.7.0.1
 */