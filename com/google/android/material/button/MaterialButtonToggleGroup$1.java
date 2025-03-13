package com.google.android.material.button;

import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;

class MaterialButtonToggleGroup$1
  implements Comparator
{
  public MaterialButtonToggleGroup$1(MaterialButtonToggleGroup paramMaterialButtonToggleGroup) {}
  
  public int compare(MaterialButton paramMaterialButton1, MaterialButton paramMaterialButton2)
  {
    Boolean localBoolean1 = Boolean.valueOf(paramMaterialButton1.isChecked());
    boolean bool = paramMaterialButton2.isChecked();
    Boolean localBoolean2 = Boolean.valueOf(bool);
    int i = localBoolean1.compareTo(localBoolean2);
    if (i != 0) {
      return i;
    }
    localBoolean1 = Boolean.valueOf(paramMaterialButton1.isPressed());
    bool = paramMaterialButton2.isPressed();
    localBoolean2 = Boolean.valueOf(bool);
    i = localBoolean1.compareTo(localBoolean2);
    if (i != 0) {
      return i;
    }
    paramMaterialButton1 = Integer.valueOf(this.this$0.indexOfChild(paramMaterialButton1));
    paramMaterialButton2 = Integer.valueOf(this.this$0.indexOfChild(paramMaterialButton2));
    return paramMaterialButton1.compareTo(paramMaterialButton2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.button.MaterialButtonToggleGroup.1
 * JD-Core Version:    0.7.0.1
 */