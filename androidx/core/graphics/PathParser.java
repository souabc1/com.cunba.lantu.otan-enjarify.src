package androidx.core.graphics;

import android.graphics.Path;
import java.util.ArrayList;

public class PathParser
{
  public static int OooO(String paramString, int paramInt)
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
  
  public static void OooO00o(ArrayList paramArrayList, char paramChar, float[] paramArrayOfFloat)
  {
    PathParser.PathDataNode localPathDataNode = new androidx/core/graphics/PathParser$PathDataNode;
    localPathDataNode.<init>(paramChar, paramArrayOfFloat);
    paramArrayList.add(localPathDataNode);
  }
  
  public static boolean OooO0O0(PathParser.PathDataNode[] paramArrayOfPathDataNode1, PathParser.PathDataNode[] paramArrayOfPathDataNode2)
  {
    if ((paramArrayOfPathDataNode1 != null) && (paramArrayOfPathDataNode2 != null))
    {
      int i = paramArrayOfPathDataNode1.length;
      int j = paramArrayOfPathDataNode2.length;
      if (i != j) {
        return false;
      }
      i = 0;
      for (;;)
      {
        j = paramArrayOfPathDataNode1.length;
        if (i >= j) {
          break label106;
        }
        Object localObject = paramArrayOfPathDataNode1[i];
        int k = ((PathParser.PathDataNode)localObject).OooO00o;
        PathParser.PathDataNode localPathDataNode = paramArrayOfPathDataNode2[i];
        int m = localPathDataNode.OooO00o;
        if (k != m) {
          break;
        }
        localObject = ((PathParser.PathDataNode)localObject).OooO0O0;
        j = localObject.length;
        float[] arrayOfFloat = localPathDataNode.OooO0O0;
        k = arrayOfFloat.length;
        if (j != k) {
          break;
        }
        i += 1;
      }
      return false;
      label106:
      return true;
    }
    return false;
  }
  
  public static float[] OooO0OO(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    if (paramInt1 <= paramInt2)
    {
      int i = paramArrayOfFloat.length;
      if ((paramInt1 >= 0) && (paramInt1 <= i))
      {
        paramInt2 -= paramInt1;
        i -= paramInt1;
        i = Math.min(paramInt2, i);
        float[] arrayOfFloat = new float[paramInt2];
        System.arraycopy(paramArrayOfFloat, paramInt1, arrayOfFloat, 0, i);
        return arrayOfFloat;
      }
      paramArrayOfFloat = new java/lang/ArrayIndexOutOfBoundsException;
      paramArrayOfFloat.<init>();
      throw paramArrayOfFloat;
    }
    paramArrayOfFloat = new java/lang/IllegalArgumentException;
    paramArrayOfFloat.<init>();
    throw paramArrayOfFloat;
  }
  
  public static PathParser.PathDataNode[] OooO0Oo(String paramString)
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
      j = OooO(paramString, j);
      str = paramString.substring(k, j).trim();
      int n = str.length();
      if (n > 0)
      {
        float[] arrayOfFloat1 = OooO0oo(str);
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
  
  public static PathParser.PathDataNode[] OooO0o(PathParser.PathDataNode[] paramArrayOfPathDataNode)
  {
    if (paramArrayOfPathDataNode == null) {
      return null;
    }
    int i = paramArrayOfPathDataNode.length;
    PathParser.PathDataNode[] arrayOfPathDataNode = new PathParser.PathDataNode[i];
    int j = 0;
    for (;;)
    {
      int k = paramArrayOfPathDataNode.length;
      if (j >= k) {
        break;
      }
      PathParser.PathDataNode localPathDataNode1 = new androidx/core/graphics/PathParser$PathDataNode;
      PathParser.PathDataNode localPathDataNode2 = paramArrayOfPathDataNode[j];
      localPathDataNode1.<init>(localPathDataNode2);
      arrayOfPathDataNode[j] = localPathDataNode1;
      j += 1;
    }
    return arrayOfPathDataNode;
  }
  
  public static Path OooO0o0(String paramString)
  {
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    Object localObject = OooO0Oo(paramString);
    if (localObject != null) {
      try
      {
        PathParser.PathDataNode.OooO0o0((PathParser.PathDataNode[])localObject, localPath);
        return localPath;
      }
      catch (RuntimeException localRuntimeException)
      {
        localObject = new java/lang/RuntimeException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Error in parsing ");
        localStringBuilder.append(paramString);
        paramString = localStringBuilder.toString();
        ((RuntimeException)localObject).<init>(paramString, localRuntimeException);
        throw ((Throwable)localObject);
      }
    }
    return null;
  }
  
  public static void OooO0oO(String paramString, int paramInt, PathParser.ExtractFloatResult paramExtractFloatResult)
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
  
  public static float[] OooO0oo(String paramString)
  {
    Object localObject1 = null;
    int i = paramString.charAt(0);
    int j = 122;
    if (i != j)
    {
      i = paramString.charAt(0);
      j = 90;
      if (i != j) {
        try
        {
          i = paramString.length();
          localObject2 = new float[i];
          localObject3 = new androidx/core/graphics/PathParser$ExtractFloatResult;
          ((PathParser.ExtractFloatResult)localObject3).<init>();
          int k = paramString.length();
          int m = 1;
          float f = 1.4E-45F;
          int i1 = 0;
          while (m < k)
          {
            OooO0oO(paramString, m, (PathParser.ExtractFloatResult)localObject3);
            int i2 = ((PathParser.ExtractFloatResult)localObject3).OooO00o;
            if (m < i2)
            {
              int i3 = i1 + 1;
              String str = paramString.substring(m, i2);
              f = Float.parseFloat(str);
              localObject2[i1] = f;
              i1 = i3;
            }
            boolean bool = ((PathParser.ExtractFloatResult)localObject3).OooO0O0;
            if (bool) {
              bool = i2;
            } else {
              int n = i2 + 1;
            }
          }
          return OooO0OO((float[])localObject2, 0, i1);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          Object localObject2 = new java/lang/RuntimeException;
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("error in parsing \"");
          ((StringBuilder)localObject3).append(paramString);
          ((StringBuilder)localObject3).append("\"");
          paramString = ((StringBuilder)localObject3).toString();
          ((RuntimeException)localObject2).<init>(paramString, localNumberFormatException);
          throw ((Throwable)localObject2);
        }
      }
    }
    return new float[0];
  }
  
  public static void OooOO0(PathParser.PathDataNode[] paramArrayOfPathDataNode1, PathParser.PathDataNode[] paramArrayOfPathDataNode2)
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfPathDataNode2.length;
      if (i >= j) {
        break;
      }
      PathParser.PathDataNode localPathDataNode = paramArrayOfPathDataNode1[i];
      Object localObject = paramArrayOfPathDataNode2[i];
      char c = ((PathParser.PathDataNode)localObject).OooO00o;
      localPathDataNode.OooO00o = c;
      j = 0;
      localPathDataNode = null;
      for (;;)
      {
        localObject = paramArrayOfPathDataNode2[i].OooO0O0;
        int k = localObject.length;
        if (j >= k) {
          break;
        }
        float[] arrayOfFloat = paramArrayOfPathDataNode1[i].OooO0O0;
        float f = localObject[j];
        arrayOfFloat[j] = f;
        j += 1;
      }
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.PathParser
 * JD-Core Version:    0.7.0.1
 */