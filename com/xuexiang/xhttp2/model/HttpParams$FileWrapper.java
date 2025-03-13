package com.xuexiang.xhttp2.model;

import com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack;
import java.io.File;
import m54207b69;
import okhttp3.MediaType;

public class HttpParams$FileWrapper
{
  public MediaType contentType;
  public Object file;
  public String fileName;
  public long fileSize;
  public IProgressResponseCallBack responseCallBack;
  
  public HttpParams$FileWrapper(Object paramObject, String paramString, MediaType paramMediaType, IProgressResponseCallBack paramIProgressResponseCallBack)
  {
    this.file = paramObject;
    this.fileName = paramString;
    this.contentType = paramMediaType;
    boolean bool = paramObject instanceof File;
    if (bool) {
      paramObject = (File)paramObject;
    }
    int i;
    for (long l = paramObject.length();; l = i)
    {
      this.fileSize = l;
      break;
      bool = paramObject instanceof byte[];
      if (!bool) {
        break;
      }
      paramObject = (byte[])paramObject;
      i = paramObject.length;
    }
    this.responseCallBack = paramIProgressResponseCallBack;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1331, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.model.HttpParams.FileWrapper
 * JD-Core Version:    0.7.0.1
 */