package com.qinggan.now.common;

import m54207b69;

public enum ResultError
{
  public String o00OoOoo;
  public int o00Ooo00;
  
  static
  {
    ResultError localResultError1 = new com/qinggan/now/common/ResultError;
    Object localObject1 = m54207b69.F54207b69_11("0i2727382A3042442D432B40353234353B3A4E32393B");
    int i = 1;
    localResultError1.<init>((String)localObject1, 0, i, "无网络连接");
    o00OooO = localResultError1;
    ResultError localResultError2 = new com/qinggan/now/common/ResultError;
    Object localObject2 = m54207b69.F54207b69_11("R*64708080697D677C866C717A718C8C");
    int j = 2;
    localResultError2.<init>((String)localObject2, i, j, "网络超时");
    o00OooO0 = localResultError2;
    localObject1 = new com/qinggan/now/common/ResultError;
    Object localObject3 = m54207b69.F54207b69_11("6D0A0212160F1B1522091F201622");
    int k = 3;
    ((ResultError)localObject1).<init>((String)localObject3, j, k, "网络错误");
    o00Ooo0o = (ResultError)localObject1;
    localObject2 = new com/qinggan/now/common/ResultError;
    Object localObject4 = m54207b69.F54207b69_11("js203723283A26323D292A462C");
    int m = 4;
    ((ResultError)localObject2).<init>((String)localObject4, k, m, "服务器错误");
    o00OooOo = (ResultError)localObject2;
    localObject3 = new com/qinggan/now/common/ResultError;
    Object localObject5 = m54207b69.F54207b69_11("r-6C797B6866846A7E74826E6D6F7F797B74727A7C");
    int n = 5;
    ((ResultError)localObject3).<init>((String)localObject5, m, n, "授权失败(HTTP授权)");
    o00Ooo0O = (ResultError)localObject3;
    localObject4 = new com/qinggan/now/common/ResultError;
    Object localObject6 = m54207b69.F54207b69_11("<66074668274847B7E6A888383757D858E8A8484");
    int i1 = 6;
    ((ResultError)localObject4).<init>((String)localObject6, n, i1, "校验失败(接口签名或效验码错误)");
    o00OoooO = (ResultError)localObject4;
    localObject5 = new com/qinggan/now/common/ResultError;
    localObject6 = m54207b69.F54207b69_11("U;6B7B6B6B82698470717D73");
    n = 7;
    String str1 = "数据解析错误";
    ((ResultError)localObject5).<init>((String)localObject6, i1, n, str1);
    o00OooOO = (ResultError)localObject5;
    localObject6 = new com/qinggan/now/common/ResultError;
    String str2 = m54207b69.F54207b69_11("0b372D2B2F313A32");
    ((ResultError)localObject6).<init>(str2, n, 99, str1);
    o0O00o0 = (ResultError)localObject6;
    ResultError[] tmp257_254 = new ResultError[8];
    ResultError[] tmp258_257 = tmp257_254;
    ResultError[] tmp258_257 = tmp257_254;
    tmp258_257[0] = localResultError1;
    tmp258_257[1] = localResultError2;
    ResultError[] tmp265_258 = tmp258_257;
    ResultError[] tmp265_258 = tmp258_257;
    tmp265_258[2] = localObject1;
    tmp265_258[3] = localObject2;
    ResultError[] tmp273_265 = tmp265_258;
    ResultError[] tmp273_265 = tmp265_258;
    tmp273_265[4] = localObject3;
    tmp273_265[5] = localObject4;
    tmp273_265[6] = localObject5;
    ResultError[] tmp287_273 = tmp273_265;
    tmp287_273[7] = localObject6;
  }
  
  public ResultError(int paramInt, String paramString)
  {
    this.o00Ooo00 = paramInt;
    this.o00OoOoo = paramString;
  }
  
  public String getMsg()
  {
    return this.o00OoOoo;
  }
  
  public int getType()
  {
    return this.o00Ooo00;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ResultError
 * JD-Core Version:    0.7.0.1
 */