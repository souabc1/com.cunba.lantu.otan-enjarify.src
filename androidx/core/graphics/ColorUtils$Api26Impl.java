package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import java.util.Objects;

class ColorUtils$Api26Impl
{
  public static Color OooO00o(Color paramColor1, Color paramColor2)
  {
    Object localObject1 = paramColor1.getModel();
    Object localObject2 = paramColor2.getModel();
    boolean bool1 = Objects.equals(localObject1, localObject2);
    if (bool1)
    {
      localObject1 = paramColor2.getColorSpace();
      localObject2 = paramColor1.getColorSpace();
      bool1 = Objects.equals(localObject1, localObject2);
      if (!bool1)
      {
        localObject1 = paramColor2.getColorSpace();
        paramColor1 = paramColor1.convert((ColorSpace)localObject1);
      }
      localObject1 = paramColor1.getComponents();
      localObject2 = paramColor2.getComponents();
      float f1 = paramColor1.alpha();
      float f2 = paramColor2.alpha();
      float f3 = 1.0F - f1;
      f2 *= f3;
      int i = paramColor2.getComponentCount() + -1;
      float f4 = f1 + f2;
      localObject2[i] = f4;
      float f5 = 0.0F;
      boolean bool2 = f4 < 0.0F;
      if (bool2)
      {
        f1 /= f4;
        f2 /= f4;
      }
      int j = 0;
      f4 = 0.0F;
      while (j < i)
      {
        f5 = localObject1[j] * f1;
        float f6 = localObject2[j] * f2;
        f5 += f6;
        localObject2[j] = f5;
        j += 1;
      }
      paramColor1 = paramColor2.getColorSpace();
      return Color.valueOf((float[])localObject2, paramColor1);
    }
    localObject1 = new java/lang/IllegalArgumentException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Color models must match (");
    paramColor1 = paramColor1.getModel();
    ((StringBuilder)localObject2).append(paramColor1);
    ((StringBuilder)localObject2).append(" vs. ");
    paramColor1 = paramColor2.getModel();
    ((StringBuilder)localObject2).append(paramColor1);
    ((StringBuilder)localObject2).append(")");
    paramColor1 = ((StringBuilder)localObject2).toString();
    ((IllegalArgumentException)localObject1).<init>(paramColor1);
    throw ((Throwable)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.ColorUtils.Api26Impl
 * JD-Core Version:    0.7.0.1
 */