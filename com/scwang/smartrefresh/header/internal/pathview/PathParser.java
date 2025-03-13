package com.scwang.smartrefresh.header.internal.pathview;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m54207b69;

class PathParser
{
  public static void OooO00o(List paramList, char paramChar, float[] paramArrayOfFloat)
  {
    PathParser.PathDataNode localPathDataNode = new com/scwang/smartrefresh/header/internal/pathview/PathParser$PathDataNode;
    localPathDataNode.<init>(paramChar, paramArrayOfFloat);
    paramList.add(localPathDataNode);
  }
  
  public static float[] OooO0O0(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfFloat.length;
    paramInt2 -= paramInt1;
    i -= paramInt1;
    i = Math.min(paramInt2, i);
    float[] arrayOfFloat = new float[paramInt2];
    System.arraycopy(paramArrayOfFloat, paramInt1, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }
  
  public static PathParser.PathDataNode[] OooO0OO(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 1;
    int j = i;
    int k = 0;
    String str = null;
    for (;;)
    {
      int m = paramString.length();
      if (j >= m) {
        break;
      }
      j = OooO0oO(paramString, j);
      str = paramString.substring(k, j).trim();
      int n = str.length();
      if (n > 0)
      {
        float[] arrayOfFloat1 = OooO0o(str);
        k = str.charAt(0);
        OooO00o(localArrayList, k, arrayOfFloat1);
      }
      int i1 = j + 1;
      k = j;
      j = i1;
    }
    j -= k;
    if (j == i)
    {
      i = paramString.length();
      if (k < i)
      {
        char c = paramString.charAt(k);
        float[] arrayOfFloat2 = new float[0];
        OooO00o(localArrayList, c, arrayOfFloat2);
      }
    }
    paramString = new PathParser.PathDataNode[localArrayList.size()];
    return (PathParser.PathDataNode[])localArrayList.toArray(paramString);
  }
  
  public static Path OooO0Oo(String paramString)
  {
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    Object localObject = OooO0OO(paramString);
    if (localObject != null) {
      try
      {
        PathParser.PathDataNode.OooO0Oo((PathParser.PathDataNode[])localObject, localPath);
        return localPath;
      }
      catch (RuntimeException localRuntimeException)
      {
        localObject = new java/lang/RuntimeException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = m54207b69.F54207b69_11("T_1A2E2F3331843C388738483838433F478F");
        localStringBuilder.append(str);
        localStringBuilder.append(paramString);
        paramString = localStringBuilder.toString();
        ((RuntimeException)localObject).<init>(paramString, localRuntimeException);
        throw ((Throwable)localObject);
      }
    }
    return null;
  }
  
  public static float[] OooO0o(String paramString)
  {
    Object localObject1 = null;
    int i = paramString.charAt(0);
    int j = 122;
    int k = 1;
    float f = 1.4E-45F;
    Object localObject2;
    if (i == j)
    {
      i = k;
    }
    else
    {
      i = 0;
      localObject2 = null;
    }
    j = paramString.charAt(0);
    int n = 90;
    Object localObject3;
    if (j == n)
    {
      j = k;
    }
    else
    {
      j = 0;
      localObject3 = null;
    }
    i |= j;
    if (i != 0) {
      return new float[0];
    }
    try
    {
      i = paramString.length();
      localObject2 = new float[i];
      localObject3 = new com/scwang/smartrefresh/header/internal/pathview/PathParser$ExtractFloatResult;
      n = 0;
      ((PathParser.ExtractFloatResult)localObject3).<init>(null);
      n = paramString.length();
      int i1 = 0;
      while (k < n)
      {
        OooO0o0(paramString, k, (PathParser.ExtractFloatResult)localObject3);
        int i2 = ((PathParser.ExtractFloatResult)localObject3).OooO00o;
        if (k < i2)
        {
          int i3 = i1 + 1;
          str = paramString.substring(k, i2);
          f = Float.parseFloat(str);
          localObject2[i1] = f;
          i1 = i3;
        }
        boolean bool = ((PathParser.ExtractFloatResult)localObject3).OooO0O0;
        if (bool) {
          bool = i2;
        } else {
          int m = i2 + 1;
        }
      }
      return OooO0O0((float[])localObject2, 0, i1);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str = m54207b69.F54207b69_11("jF2335362C386B352F6E3F313F413C36307675");
      ((StringBuilder)localObject3).append(str);
      ((StringBuilder)localObject3).append(paramString);
      ((StringBuilder)localObject3).append("\"");
      paramString = ((StringBuilder)localObject3).toString();
      ((RuntimeException)localObject2).<init>(paramString, localNumberFormatException);
      throw ((Throwable)localObject2);
    }
  }
  
  public static void OooO0o0(String paramString, int paramInt, PathParser.ExtractFloatResult paramExtractFloatResult)
  {
    paramExtractFloatResult.OooO0O0 = false;
    int i = paramInt;
    int j = 0;
    int k = 0;
    int m = 0;
    for (;;)
    {
      int n = paramString.length();
      if (i >= n) {
        break;
      }
      n = paramString.charAt(i);
      int i1 = 32;
      boolean bool = true;
      if (n != i1)
      {
        i1 = 69;
        if (n != i1)
        {
          i1 = 101;
          if (n == i1) {}
        }
        switch (n)
        {
        default: 
          break;
        case 46: 
          if (k == 0)
          {
            j = 0;
            k = bool;
          }
          break;
        case 45: 
          do
          {
            paramExtractFloatResult.OooO0O0 = bool;
            break;
          } while ((i != paramInt) && (j == 0));
          j = 0;
          break label160;
          j = bool;
          break;
        }
      }
      j = 0;
      m = bool;
      label160:
      if (m != 0) {
        break;
      }
      i += 1;
    }
    paramExtractFloatResult.OooO00o = i;
  }
  
  public static int OooO0oO(String paramString, int paramInt)
  {
    for (;;)
    {
      int i = paramString.length();
      if (paramInt >= i) {
        break;
      }
      i = paramString.charAt(paramInt);
      int j = i + -65;
      int k = i + -90;
      j *= k;
      if (j > 0)
      {
        j = i + -97;
        k = i + -122;
        j *= k;
        if (j > 0) {}
      }
      else
      {
        j = 101;
        if (i != j)
        {
          j = 69;
          if (i != j) {
            return paramInt;
          }
        }
      }
      paramInt += 1;
    }
    return paramInt;
  }
  
  public static List OooO0oo(float paramFloat1, float paramFloat2, List paramList1, List paramList2)
  {
    paramList2 = new android/graphics/Matrix;
    paramList2.<init>();
    paramList2.setScale(paramFloat1, paramFloat2);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = paramList1.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      paramList1 = (Path)localIterator.next();
      Path localPath = new android/graphics/Path;
      localPath.<init>();
      paramList1.transform(paramList2, localPath);
      localArrayList.add(localPath);
    }
    return localArrayList;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.internal.pathview.PathParser
 * JD-Core Version:    0.7.0.1
 */