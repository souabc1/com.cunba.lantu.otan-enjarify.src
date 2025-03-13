package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.R.styleable;

class KeyPosition$Loader
{
  public static SparseIntArray OooO00o;
  
  static
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooO00o = localSparseIntArray;
    int i = R.styleable.KeyPosition_motionTarget;
    localSparseIntArray.append(i, 1);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_framePosition;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_transitionEasing;
    localSparseIntArray.append(i, 3);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_curveFit;
    localSparseIntArray.append(i, 4);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_drawPath;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_percentX;
    localSparseIntArray.append(i, 6);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_percentY;
    localSparseIntArray.append(i, 7);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_keyPositionType;
    localSparseIntArray.append(i, 9);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_sizePercent;
    localSparseIntArray.append(i, 8);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_percentWidth;
    localSparseIntArray.append(i, 11);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_percentHeight;
    localSparseIntArray.append(i, 12);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyPosition_pathMotionArc;
    localSparseIntArray.append(i, 10);
  }
  
  public static void OooO0O0(KeyPosition paramKeyPosition, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramTypedArray.getIndex(j);
      Object localObject1 = OooO00o;
      int m = ((SparseIntArray)localObject1).get(k);
      int i1 = 3;
      float f1;
      float f2;
      switch (m)
      {
      default: 
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("unused attribute 0x");
        Object localObject2 = Integer.toHexString(k);
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append("   ");
        localObject2 = OooO00o;
        k = ((SparseIntArray)localObject2).get(k);
        ((StringBuilder)localObject1).append(k);
        break;
      case 12: 
        f1 = paramKeyPosition.OooOO0o;
        f2 = paramTypedArray.getFloat(k, f1);
        break;
      case 11: 
        f1 = paramKeyPosition.OooOO0O;
        f2 = paramTypedArray.getFloat(k, f1);
        paramKeyPosition.OooOO0O = f2;
        break;
      case 10: 
        m = paramKeyPosition.OooO;
        k = paramTypedArray.getInt(k, m);
        paramKeyPosition.OooO = k;
        break;
      case 9: 
        m = paramKeyPosition.OooOOo0;
        k = paramTypedArray.getInt(k, m);
        paramKeyPosition.OooOOo0 = k;
        break;
      case 8: 
        f1 = paramKeyPosition.OooOO0o;
        f2 = paramTypedArray.getFloat(k, f1);
        paramKeyPosition.OooOO0O = f2;
        paramKeyPosition.OooOO0o = f2;
        break;
      case 7: 
        f1 = paramKeyPosition.OooOOO;
        f2 = paramTypedArray.getFloat(k, f1);
        paramKeyPosition.OooOOO = f2;
        break;
      case 6: 
        f1 = paramKeyPosition.OooOOO0;
        f2 = paramTypedArray.getFloat(k, f1);
        paramKeyPosition.OooOOO0 = f2;
        break;
      case 5: 
        m = paramKeyPosition.OooOO0;
        k = paramTypedArray.getInt(k, m);
        paramKeyPosition.OooOO0 = k;
        break;
      case 4: 
        m = paramKeyPosition.OooO0oO;
        k = paramTypedArray.getInteger(k, m);
        paramKeyPosition.OooO0oO = k;
        break;
      case 3: 
        localObject1 = paramTypedArray.peekValue(k);
        m = ((TypedValue)localObject1).type;
        if (m == i1)
        {
          str = paramTypedArray.getString(k);
        }
        else
        {
          localObject1 = Easing.OooO0OO;
          k = paramTypedArray.getInteger(k, 0);
          str = localObject1[k];
        }
        paramKeyPosition.OooO0oo = str;
        break;
      case 2: 
        m = paramKeyPosition.OooO00o;
        k = paramTypedArray.getInt(k, m);
        paramKeyPosition.OooO00o = k;
        break;
      }
      boolean bool = MotionLayout.o00oo0O;
      if (bool)
      {
        n = paramKeyPosition.OooO0O0;
        n = paramTypedArray.getResourceId(k, n);
        paramKeyPosition.OooO0O0 = n;
        i1 = -1;
        if (n != i1) {
          break label585;
        }
      }
      else
      {
        localObject1 = paramTypedArray.peekValue(k);
        n = ((TypedValue)localObject1).type;
        if (n != i1) {
          break label563;
        }
      }
      String str = paramTypedArray.getString(k);
      paramKeyPosition.OooO0OO = str;
      break label585;
      label563:
      int n = paramKeyPosition.OooO0O0;
      k = paramTypedArray.getResourceId(k, n);
      paramKeyPosition.OooO0O0 = k;
      label585:
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyPosition.Loader
 * JD-Core Version:    0.7.0.1
 */