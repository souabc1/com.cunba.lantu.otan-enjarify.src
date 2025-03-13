package com.xuexiang.xhttp2.model;

import com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m54207b69;
import okhttp3.MediaType;

public class HttpParams
  implements Serializable
{
  public LinkedHashMap fileParamsMap;
  public LinkedHashMap urlParamsMap;
  
  public HttpParams()
  {
    init();
  }
  
  public HttpParams(String paramString1, String paramString2)
  {
    init();
    put(paramString1, paramString2);
  }
  
  public HttpParams(Map paramMap)
  {
    init();
    put(paramMap);
  }
  
  private MediaType guessMimeType(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (MediaType)m54207b69.F54207b69_09(1333, arrayOfObject);
  }
  
  private void init()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(1334, arrayOfObject);
  }
  
  private void put(String paramString1, Object paramObject, String paramString2, MediaType paramMediaType, IProgressResponseCallBack paramIProgressResponseCallBack)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramObject;
    arrayOfObject[3] = paramString2;
    arrayOfObject[4] = paramMediaType;
    arrayOfObject[5] = paramIProgressResponseCallBack;
    m54207b69.F54207b69_00(1341, arrayOfObject);
  }
  
  public void clear()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(1332, arrayOfObject);
  }
  
  public HttpParams put(HttpParams paramHttpParams)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramHttpParams;
    return (HttpParams)m54207b69.F54207b69_09(1335, arrayOfObject);
  }
  
  public HttpParams put(String paramString, Object paramObject)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = paramObject;
    return (HttpParams)m54207b69.F54207b69_09(1336, arrayOfObject);
  }
  
  public HttpParams put(Map paramMap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMap;
    return (HttpParams)m54207b69.F54207b69_09(1337, arrayOfObject);
  }
  
  public void put(String paramString, File paramFile, IProgressResponseCallBack paramIProgressResponseCallBack)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = paramFile;
    arrayOfObject[3] = paramIProgressResponseCallBack;
    m54207b69.F54207b69_00(1338, arrayOfObject);
  }
  
  public void put(String paramString1, File paramFile, String paramString2, IProgressResponseCallBack paramIProgressResponseCallBack)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramFile;
    arrayOfObject[3] = paramString2;
    arrayOfObject[4] = paramIProgressResponseCallBack;
    m54207b69.F54207b69_00(1339, arrayOfObject);
  }
  
  public void put(String paramString1, InputStream paramInputStream, String paramString2, IProgressResponseCallBack paramIProgressResponseCallBack)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramInputStream;
    arrayOfObject[3] = paramString2;
    arrayOfObject[4] = paramIProgressResponseCallBack;
    m54207b69.F54207b69_00(1340, arrayOfObject);
  }
  
  public void put(String paramString1, byte[] paramArrayOfByte, String paramString2, IProgressResponseCallBack paramIProgressResponseCallBack)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramArrayOfByte;
    arrayOfObject[3] = paramString2;
    arrayOfObject[4] = paramIProgressResponseCallBack;
    m54207b69.F54207b69_00(1342, arrayOfObject);
  }
  
  public void putFileParams(String paramString, List paramList, IProgressResponseCallBack paramIProgressResponseCallBack)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = paramList;
    arrayOfObject[3] = paramIProgressResponseCallBack;
    m54207b69.F54207b69_00(1343, arrayOfObject);
  }
  
  public void remove(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(1344, arrayOfObject);
  }
  
  public void removeFile(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(1345, arrayOfObject);
  }
  
  public void removeUrl(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(1346, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1347, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.model.HttpParams
 * JD-Core Version:    0.7.0.1
 */