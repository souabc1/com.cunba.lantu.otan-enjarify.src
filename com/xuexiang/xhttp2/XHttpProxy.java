package com.xuexiang.xhttp2;

import com.xuexiang.xhttp2.annotation.NetMethod;
import com.xuexiang.xhttp2.exception.ApiException;
import com.xuexiang.xhttp2.request.BaseBodyRequest;
import com.xuexiang.xhttp2.request.BaseRequest;
import com.xuexiang.xhttp2.utils.HttpUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.TreeMap;
import m54207b69;

public class XHttpProxy
  implements InvocationHandler
{
  public String OooO00o;
  
  public XHttpProxy()
  {
    this(str);
  }
  
  public XHttpProxy(String paramString)
  {
    this.OooO00o = paramString;
  }
  
  public final String OooO00o(Method paramMethod, Object[] paramArrayOfObject, NetMethod paramNetMethod)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMethod;
    arrayOfObject[2] = paramArrayOfObject;
    arrayOfObject[3] = paramNetMethod;
    return (String)m54207b69.F54207b69_09(1045, arrayOfObject);
  }
  
  public final BaseRequest OooO0O0(Method paramMethod, Object[] paramArrayOfObject, NetMethod paramNetMethod)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMethod;
    arrayOfObject[2] = paramArrayOfObject;
    arrayOfObject[3] = paramNetMethod;
    return (BaseRequest)m54207b69.F54207b69_09(1046, arrayOfObject);
  }
  
  public final Map OooO0OO(Method paramMethod, Object[] paramArrayOfObject, NetMethod paramNetMethod)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMethod;
    arrayOfObject[2] = paramArrayOfObject;
    arrayOfObject[3] = paramNetMethod;
    return (Map)m54207b69.F54207b69_09(1047, arrayOfObject);
  }
  
  public final Map OooO0Oo(Method paramMethod, Object[] paramArrayOfObject, NetMethod paramNetMethod, int paramInt)
  {
    TreeMap localTreeMap = new java/util/TreeMap;
    localTreeMap.<init>();
    paramMethod = paramMethod.getGenericParameterTypes();
    for (;;)
    {
      int i = paramMethod.length;
      if (paramInt >= i) {
        break;
      }
      String str = paramNetMethod.parameterNames()[paramInt];
      Object localObject = paramArrayOfObject[paramInt];
      localTreeMap.put(str, localObject);
      paramInt += 1;
    }
    return localTreeMap;
  }
  
  public final Type OooO0o0(Method paramMethod)
  {
    Object localObject = paramMethod.getGenericReturnType();
    boolean bool = localObject instanceof ParameterizedType;
    if (bool) {
      return ((ParameterizedType)localObject).getActualTypeArguments()[0];
    }
    localObject = new com/xuexiang/xhttp2/exception/ApiException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("接口方法:");
    paramMethod = paramMethod.getName();
    localStringBuilder.append(paramMethod);
    localStringBuilder.append("的返回值类型不是泛型, 必须返回Observable<T>类型");
    paramMethod = localStringBuilder.toString();
    ((ApiException)localObject).<init>(paramMethod, 5012);
    throw ((Throwable)localObject);
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    paramObject = (NetMethod)paramMethod.getAnnotation(NetMethod.class);
    int i = 5012;
    if (paramObject != null)
    {
      int j = paramObject.paramType();
      int m = 4;
      int n = 1;
      Object localObject1;
      if (j == m)
      {
        localObject1 = paramMethod.getGenericParameterTypes();
        j = localObject1.length;
        if (j != n)
        {
          paramObject = new com/xuexiang/xhttp2/exception/ApiException;
          paramArrayOfObject = new java/lang/StringBuilder;
          paramArrayOfObject.<init>();
          paramMethod = paramMethod.getName();
          paramArrayOfObject.append(paramMethod);
          paramArrayOfObject.append("方法NetMethod的paramType为JSON_OBJECT时，接口的方法参数必须是一个");
          paramMethod = paramArrayOfObject.toString();
          paramObject.<init>(paramMethod, i);
          throw paramObject;
        }
      }
      else
      {
        localObject1 = paramObject.parameterNames();
        j = localObject1.length;
        arrayOfType = paramMethod.getGenericParameterTypes();
        i1 = arrayOfType.length;
        if (j != i1) {
          break label380;
        }
      }
      BaseRequest localBaseRequest = OooO0O0(paramMethod, paramArrayOfObject, paramObject);
      boolean bool = localBaseRequest instanceof BaseBodyRequest;
      int i1 = 0;
      Type[] arrayOfType = null;
      int k;
      if (bool)
      {
        k = paramObject.paramType();
        if (k == n)
        {
          localObject1 = localBaseRequest;
          localObject1 = (BaseBodyRequest)localBaseRequest;
          paramObject = HttpUtils.OooO0o(OooO0OO(paramMethod, paramArrayOfObject, paramObject));
          ((BaseBodyRequest)localObject1).OooOoOO(paramObject);
          break label367;
        }
        k = paramObject.paramType();
        if (k == m)
        {
          paramObject = localBaseRequest;
          paramObject = (BaseBodyRequest)localBaseRequest;
          paramArrayOfObject = HttpUtils.OooO0o(paramArrayOfObject[0]);
          paramObject.OooOoOO(paramArrayOfObject);
          break label367;
        }
      }
      else
      {
        k = paramObject.paramType();
        m = 3;
        if (k == m)
        {
          k = paramArrayOfObject.length;
          if (k <= 0) {
            break label367;
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Object localObject2 = paramObject.url();
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append("/");
          localObject2 = paramArrayOfObject[0];
          ((StringBuilder)localObject1).append(localObject2);
          localObject1 = ((StringBuilder)localObject1).toString();
          localBaseRequest.OooOo((String)localObject1);
          paramObject = OooO0Oo(paramMethod, paramArrayOfObject, paramObject, n);
          break label360;
        }
      }
      paramObject = OooO0OO(paramMethod, paramArrayOfObject, paramObject);
      label360:
      localBaseRequest.OooOOoo(paramObject);
      label367:
      paramObject = OooO0o0(paramMethod);
      return localBaseRequest.OooO0oo(paramObject);
      label380:
      paramObject = new com/xuexiang/xhttp2/exception/ApiException;
      paramArrayOfObject = new java/lang/StringBuilder;
      paramArrayOfObject.<init>();
      paramMethod = paramMethod.getName();
      paramArrayOfObject.append(paramMethod);
      paramArrayOfObject.append("方法NetMethod注释与实际参数个数不对应");
      paramMethod = paramArrayOfObject.toString();
      paramObject.<init>(paramMethod, i);
      throw paramObject;
    }
    paramObject = new com/xuexiang/xhttp2/exception/ApiException;
    paramArrayOfObject = new java/lang/StringBuilder;
    paramArrayOfObject.<init>();
    paramMethod = paramMethod.getName();
    paramArrayOfObject.append(paramMethod);
    paramArrayOfObject.append("方法无NetMethod注释");
    paramMethod = paramArrayOfObject.toString();
    paramObject.<init>(paramMethod, i);
    throw paramObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.XHttpProxy
 * JD-Core Version:    0.7.0.1
 */