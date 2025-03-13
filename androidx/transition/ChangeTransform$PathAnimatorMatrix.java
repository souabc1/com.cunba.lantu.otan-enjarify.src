package androidx.transition;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

class ChangeTransform$PathAnimatorMatrix
{
  public final Matrix OooO00o;
  public final View OooO0O0;
  public final float[] OooO0OO;
  public float OooO0Oo;
  public float OooO0o0;
  
  public ChangeTransform$PathAnimatorMatrix(View paramView, float[] paramArrayOfFloat)
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    this.OooO00o = localMatrix;
    this.OooO0O0 = paramView;
    paramView = (float[])paramArrayOfFloat.clone();
    this.OooO0OO = paramView;
    float f1 = paramView[2];
    this.OooO0Oo = f1;
    float f2 = paramView[5];
    this.OooO0o0 = f2;
    OooO00o();
  }
  
  public final void OooO00o()
  {
    Object localObject = this.OooO0OO;
    float f = this.OooO0Oo;
    localObject[2] = f;
    f = this.OooO0o0;
    localObject[5] = f;
    this.OooO00o.setValues((float[])localObject);
    localObject = this.OooO0O0;
    Matrix localMatrix = this.OooO00o;
    ViewUtils.OooO0o((View)localObject, localMatrix);
  }
  
  public Matrix getMatrix()
  {
    return this.OooO00o;
  }
  
  public void setTranslation(PointF paramPointF)
  {
    float f1 = paramPointF.x;
    this.OooO0Oo = f1;
    float f2 = paramPointF.y;
    this.OooO0o0 = f2;
    OooO00o();
  }
  
  public void setValues(float[] paramArrayOfFloat)
  {
    float[] arrayOfFloat = this.OooO0OO;
    int i = paramArrayOfFloat.length;
    System.arraycopy(paramArrayOfFloat, 0, arrayOfFloat, 0, i);
    OooO00o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeTransform.PathAnimatorMatrix
 * JD-Core Version:    0.7.0.1
 */