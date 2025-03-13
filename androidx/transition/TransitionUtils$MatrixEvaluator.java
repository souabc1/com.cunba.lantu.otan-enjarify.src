package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

class TransitionUtils$MatrixEvaluator
  implements TypeEvaluator
{
  public final float[] OooO00o;
  public final float[] OooO0O0;
  public final Matrix OooO0OO;
  
  public TransitionUtils$MatrixEvaluator()
  {
    int i = 9;
    float[] arrayOfFloat = new float[i];
    this.OooO00o = arrayOfFloat;
    Object localObject = new float[i];
    this.OooO0O0 = ((float[])localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.OooO0OO = ((Matrix)localObject);
  }
  
  public Matrix OooO00o(float paramFloat, Matrix paramMatrix1, Matrix paramMatrix2)
  {
    float[] arrayOfFloat1 = this.OooO00o;
    paramMatrix1.getValues(arrayOfFloat1);
    paramMatrix1 = this.OooO0O0;
    paramMatrix2.getValues(paramMatrix1);
    int i = 0;
    paramMatrix1 = null;
    for (;;)
    {
      int j = 9;
      if (i >= j) {
        break;
      }
      paramMatrix2 = this.OooO0O0;
      float f1 = paramMatrix2[i];
      float[] arrayOfFloat2 = this.OooO00o;
      float f2 = arrayOfFloat2[i];
      f1 = (f1 - f2) * paramFloat;
      f2 += f1;
      paramMatrix2[i] = f2;
      i += 1;
    }
    Matrix localMatrix = this.OooO0OO;
    paramMatrix1 = this.OooO0O0;
    localMatrix.setValues(paramMatrix1);
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.TransitionUtils.MatrixEvaluator
 * JD-Core Version:    0.7.0.1
 */