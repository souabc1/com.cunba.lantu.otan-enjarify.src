package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R.styleable;

class KeyAttributes$Loader
{
  public static SparseIntArray OooO00o;
  
  static
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooO00o = localSparseIntArray;
    int i = R.styleable.KeyAttribute_android_alpha;
    localSparseIntArray.append(i, 1);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_elevation;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_rotation;
    localSparseIntArray.append(i, 4);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_rotationX;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_rotationY;
    localSparseIntArray.append(i, 6);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_transformPivotX;
    localSparseIntArray.append(i, 19);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_transformPivotY;
    localSparseIntArray.append(i, 20);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_scaleX;
    localSparseIntArray.append(i, 7);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_transitionPathRotate;
    localSparseIntArray.append(i, 8);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_transitionEasing;
    localSparseIntArray.append(i, 9);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_motionTarget;
    localSparseIntArray.append(i, 10);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_framePosition;
    localSparseIntArray.append(i, 12);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_curveFit;
    localSparseIntArray.append(i, 13);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_scaleY;
    localSparseIntArray.append(i, 14);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_translationX;
    localSparseIntArray.append(i, 15);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_translationY;
    localSparseIntArray.append(i, 16);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_android_translationZ;
    localSparseIntArray.append(i, 17);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyAttribute_motionProgress;
    localSparseIntArray.append(i, 18);
  }
  
  public static void OooO00o(KeyAttributes paramKeyAttributes, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramTypedArray.getIndex(j);
      Object localObject1 = OooO00o;
      int m = ((SparseIntArray)localObject1).get(k);
      float f1;
      float f2;
      String str;
      switch (m)
      {
      case 3: 
      case 11: 
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
      case 20: 
        f1 = KeyAttributes.Oooo0o(paramKeyAttributes);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyAttributes.Oooo0oO(paramKeyAttributes, f2);
        break;
      case 19: 
        f1 = KeyAttributes.Oooo0OO(paramKeyAttributes);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyAttributes.Oooo0o0(paramKeyAttributes, f2);
        break;
      case 18: 
        f1 = KeyAttributes.OooOoO0(paramKeyAttributes);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyAttributes.OooOoO(paramKeyAttributes, f2);
        break;
      case 17: 
        f1 = KeyAttributes.OooOo0o(paramKeyAttributes);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyAttributes.OooOo(paramKeyAttributes, f2);
        break;
      case 16: 
        f1 = KeyAttributes.OooOo0(paramKeyAttributes);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyAttributes.OooOo0O(paramKeyAttributes, f2);
        break;
      case 15: 
        f1 = KeyAttributes.OooOOoo(paramKeyAttributes);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyAttributes.OooOo00(paramKeyAttributes, f2);
        break;
      case 14: 
        f1 = KeyAttributes.OooOOO(paramKeyAttributes);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyAttributes.OooOOOO(paramKeyAttributes, f2);
        break;
      case 13: 
        m = KeyAttributes.OooOoo(paramKeyAttributes);
        k = paramTypedArray.getInteger(k, m);
        KeyAttributes.OooOooO(paramKeyAttributes, k);
        break;
      case 12: 
        m = paramKeyAttributes.OooO00o;
        k = paramTypedArray.getInt(k, m);
        paramKeyAttributes.OooO00o = k;
        break;
      case 10: 
        boolean bool = MotionLayout.o00oo0O;
        int i1;
        if (bool)
        {
          n = paramKeyAttributes.OooO0O0;
          n = paramTypedArray.getResourceId(k, n);
          paramKeyAttributes.OooO0O0 = n;
          i1 = -1;
          if (n != i1) {
            break;
          }
        }
        else
        {
          localObject1 = paramTypedArray.peekValue(k);
          n = ((TypedValue)localObject1).type;
          i1 = 3;
          if (n != i1) {
            break label514;
          }
        }
        str = paramTypedArray.getString(k);
        paramKeyAttributes.OooO0OO = str;
        break;
        int n = paramKeyAttributes.OooO0O0;
        k = paramTypedArray.getResourceId(k, n);
        paramKeyAttributes.OooO0O0 = k;
        break;
      case 9: 
        str = paramTypedArray.getString(k);
        KeyAttributes.Oooo0oo(paramKeyAttributes, str);
        break;
      case 8: 
        f1 = KeyAttributes.OooOOo0(paramKeyAttributes);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyAttributes.OooOOo(paramKeyAttributes, f2);
        break;
      case 7: 
        f1 = KeyAttributes.OooOooo(paramKeyAttributes);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyAttributes.Oooo000(paramKeyAttributes, f2);
        break;
      case 6: 
        f1 = KeyAttributes.Oooo0(paramKeyAttributes);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyAttributes.Oooo0O0(paramKeyAttributes, f2);
        break;
      case 5: 
        f1 = KeyAttributes.Oooo00O(paramKeyAttributes);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyAttributes.Oooo00o(paramKeyAttributes, f2);
        break;
      case 4: 
        f1 = KeyAttributes.OooOoOO(paramKeyAttributes);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyAttributes.OooOoo0(paramKeyAttributes, f2);
        break;
      case 2: 
        f1 = KeyAttributes.OooOOO0(paramKeyAttributes);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyAttributes.OooOOOo(paramKeyAttributes, f2);
        break;
      case 1: 
        label514:
        f1 = KeyAttributes.OooOO0O(paramKeyAttributes);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyAttributes.OooOO0o(paramKeyAttributes, f2);
      }
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyAttributes.Loader
 * JD-Core Version:    0.7.0.1
 */