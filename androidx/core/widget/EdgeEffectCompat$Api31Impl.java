package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

class EdgeEffectCompat$Api31Impl
{
  public static EdgeEffect OooO00o(Context paramContext, AttributeSet paramAttributeSet)
  {
    try
    {
      EdgeEffect localEdgeEffect = new android/widget/EdgeEffect;
      localEdgeEffect.<init>(paramContext, paramAttributeSet);
      return localEdgeEffect;
    }
    finally
    {
      paramAttributeSet = new android/widget/EdgeEffect;
      paramAttributeSet.<init>(paramContext);
    }
    return paramAttributeSet;
  }
  
  /* Error */
  public static float OooO0O0(EdgeEffect paramEdgeEffect)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 20	android/widget/EdgeEffect:getDistance	()F
    //   4: freturn
    //   5: pop
    //   6: fconst_0
    //   7: freturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	8	0	paramEdgeEffect	EdgeEffect
    // Exception table:
    //   from	to	target	type
    //   0	4	5	finally
  }
  
  /* Error */
  public static float OooO0OO(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    // Byte code:
    //   0: aload_0
    //   1: fload_1
    //   2: fload_2
    //   3: invokevirtual 24	android/widget/EdgeEffect:onPullDistance	(FF)F
    //   6: freturn
    //   7: pop
    //   8: aload_0
    //   9: fload_1
    //   10: fload_2
    //   11: invokevirtual 28	android/widget/EdgeEffect:onPull	(FF)V
    //   14: fconst_0
    //   15: freturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	16	0	paramEdgeEffect	EdgeEffect
    //   0	16	1	paramFloat1	float
    //   0	16	2	paramFloat2	float
    // Exception table:
    //   from	to	target	type
    //   2	6	7	finally
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.EdgeEffectCompat.Api31Impl
 * JD-Core Version:    0.7.0.1
 */