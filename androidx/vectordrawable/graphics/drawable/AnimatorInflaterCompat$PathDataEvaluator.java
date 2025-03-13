package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.PathParser.PathDataNode;

class AnimatorInflaterCompat$PathDataEvaluator
  implements TypeEvaluator
{
  public PathParser.PathDataNode[] OooO00o;
  
  public PathParser.PathDataNode[] OooO00o(float paramFloat, PathParser.PathDataNode[] paramArrayOfPathDataNode1, PathParser.PathDataNode[] paramArrayOfPathDataNode2)
  {
    int i = PathParser.OooO0O0(paramArrayOfPathDataNode1, paramArrayOfPathDataNode2);
    if (i != 0)
    {
      PathParser.PathDataNode[] arrayOfPathDataNode = this.OooO00o;
      i = PathParser.OooO0O0(arrayOfPathDataNode, paramArrayOfPathDataNode1);
      if (i == 0)
      {
        arrayOfPathDataNode = PathParser.OooO0o(paramArrayOfPathDataNode1);
        this.OooO00o = arrayOfPathDataNode;
      }
      i = 0;
      arrayOfPathDataNode = null;
      for (;;)
      {
        int k = paramArrayOfPathDataNode1.length;
        if (i >= k) {
          break;
        }
        PathParser.PathDataNode localPathDataNode1 = this.OooO00o[i];
        PathParser.PathDataNode localPathDataNode2 = paramArrayOfPathDataNode1[i];
        PathParser.PathDataNode localPathDataNode3 = paramArrayOfPathDataNode2[i];
        localPathDataNode1.OooO0Oo(localPathDataNode2, localPathDataNode3, paramFloat);
        int j;
        i += 1;
      }
      return this.OooO00o;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Can't interpolate between two incompatible pathData");
    throw localIllegalArgumentException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.PathDataEvaluator
 * JD-Core Version:    0.7.0.1
 */