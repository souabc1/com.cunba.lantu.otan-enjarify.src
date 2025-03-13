package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.MaterialColors;

class MaterialAutoCompleteTextView$MaterialArrayAdapter
  extends ArrayAdapter
{
  private ColorStateList pressedRippleColor;
  private ColorStateList selectedItemRippleOverlaidColor;
  
  public MaterialAutoCompleteTextView$MaterialArrayAdapter(MaterialAutoCompleteTextView paramMaterialAutoCompleteTextView, Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    super(paramContext, paramInt, paramArrayOfString);
    updateSelectedItemColorStateList();
  }
  
  private ColorStateList createItemSelectedColorStateList()
  {
    boolean bool = hasSelectedColor();
    if (bool)
    {
      bool = hasSelectedRippleColor();
      if (bool)
      {
        int i = -16842919;
        Object localObject = { 16843623, i };
        int[] arrayOfInt1 = { 16842913, i };
        int j = MaterialAutoCompleteTextView.access$300(this.this$0).getColorForState(arrayOfInt1, 0);
        int k = MaterialAutoCompleteTextView.access$300(this.this$0).getColorForState((int[])localObject, 0);
        j = MaterialColors.layer(MaterialAutoCompleteTextView.access$200(this.this$0), j);
        k = MaterialColors.layer(MaterialAutoCompleteTextView.access$200(this.this$0), k);
        int m = MaterialAutoCompleteTextView.access$200(this.this$0);
        int[] tmp117_115 = new int[3];
        int[] tmp118_117 = tmp117_115;
        int[] tmp118_117 = tmp117_115;
        tmp118_117[0] = j;
        tmp118_117[1] = k;
        tmp118_117[2] = m;
        int[] arrayOfInt2 = tmp118_117;
        int[][] arrayOfInt = new int[3][];
        arrayOfInt[0] = arrayOfInt1;
        arrayOfInt[1] = localObject;
        arrayOfInt1 = new int[0];
        arrayOfInt[2] = arrayOfInt1;
        localObject = new android/content/res/ColorStateList;
        ((ColorStateList)localObject).<init>(arrayOfInt, arrayOfInt2);
        return localObject;
      }
    }
    return null;
  }
  
  private Drawable getSelectedItemDrawable()
  {
    boolean bool = hasSelectedColor();
    if (bool)
    {
      ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
      int i = MaterialAutoCompleteTextView.access$200(this.this$0);
      localColorDrawable.<init>(i);
      Object localObject = this.pressedRippleColor;
      if (localObject != null)
      {
        localObject = this.selectedItemRippleOverlaidColor;
        DrawableCompat.OooOOOO(localColorDrawable, (ColorStateList)localObject);
        localObject = new android/graphics/drawable/RippleDrawable;
        ColorStateList localColorStateList = this.pressedRippleColor;
        ((RippleDrawable)localObject).<init>(localColorStateList, localColorDrawable, null);
        return localObject;
      }
      return localColorDrawable;
    }
    return null;
  }
  
  private boolean hasSelectedColor()
  {
    MaterialAutoCompleteTextView localMaterialAutoCompleteTextView = this.this$0;
    int i = MaterialAutoCompleteTextView.access$200(localMaterialAutoCompleteTextView);
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localMaterialAutoCompleteTextView = null;
    }
    return i;
  }
  
  private boolean hasSelectedRippleColor()
  {
    ColorStateList localColorStateList = MaterialAutoCompleteTextView.access$300(this.this$0);
    boolean bool;
    if (localColorStateList != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localColorStateList = null;
    }
    return bool;
  }
  
  private ColorStateList sanitizeDropdownItemSelectedRippleColor()
  {
    boolean bool = hasSelectedRippleColor();
    if (!bool) {
      return null;
    }
    Object localObject = { 16842919 };
    int i = MaterialAutoCompleteTextView.access$300(this.this$0).getColorForState((int[])localObject, 0);
    int[] arrayOfInt1 = { i, 0 };
    int[][] arrayOfInt = new int[2][];
    arrayOfInt[0] = localObject;
    int[] arrayOfInt2 = new int[0];
    arrayOfInt[1] = arrayOfInt2;
    localObject = new android/content/res/ColorStateList;
    ((ColorStateList)localObject).<init>(arrayOfInt, arrayOfInt1);
    return localObject;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = super.getView(paramInt, paramView, paramViewGroup);
    boolean bool1 = localView instanceof TextView;
    if (bool1)
    {
      paramView = localView;
      paramView = (TextView)localView;
      paramViewGroup = this.this$0.getText().toString();
      CharSequence localCharSequence = paramView.getText();
      boolean bool2 = paramViewGroup.contentEquals(localCharSequence);
      if (bool2)
      {
        paramViewGroup = getSelectedItemDrawable();
      }
      else
      {
        bool2 = false;
        paramViewGroup = null;
      }
      ViewCompat.o0ooOoO(paramView, paramViewGroup);
    }
    return (View)localView;
  }
  
  public void updateSelectedItemColorStateList()
  {
    ColorStateList localColorStateList = sanitizeDropdownItemSelectedRippleColor();
    this.pressedRippleColor = localColorStateList;
    localColorStateList = createItemSelectedColorStateList();
    this.selectedItemRippleOverlaidColor = localColorStateList;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter
 * JD-Core Version:    0.7.0.1
 */