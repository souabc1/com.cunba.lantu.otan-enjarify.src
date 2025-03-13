package androidx.transition;

import android.animation.TypeEvaluator;

class FloatArrayEvaluator
  implements TypeEvaluator
{
  public float[] OooO00o;
  
  public FloatArrayEvaluator(float[] paramArrayOfFloat)
  {
    this.OooO00o = paramArrayOfFloat;
  }
  
  public float[] OooO00o(float paramFloat, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float[] arrayOfFloat = this.OooO00o;
    if (arrayOfFloat == null)
    {
      int i = paramArrayOfFloat1.length;
      arrayOfFloat = new float[i];
    }
    int j = 0;
    for (;;)
    {
      int k = arrayOfFloat.length;
      if (j >= k) {
        break;
      }
      float f1 = paramArrayOfFloat1[j];
      float f2 = (paramArrayOfFloat2[j] - f1) * paramFloat;
      f1 += f2;
      arrayOfFloat[j] = f1;
      j += 1;
    }
    return arrayOfFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.FloatArrayEvaluator
 * JD-Core Version:    0.7.0.1
 */