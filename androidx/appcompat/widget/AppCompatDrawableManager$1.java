package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.color;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;

class AppCompatDrawableManager$1
  implements ResourceManagerInternal.ResourceManagerHooks
{
  public final int[] OooO00o;
  public final int[] OooO0O0;
  public final int[] OooO0OO;
  public final int[] OooO0Oo;
  public final int[] OooO0o;
  public final int[] OooO0o0;
  
  public AppCompatDrawableManager$1()
  {
    int i = R.drawable.abc_textfield_search_default_mtrl_alpha;
    int j = R.drawable.abc_textfield_default_mtrl_alpha;
    int k = R.drawable.abc_ab_share_pack_mtrl_alpha;
    int[] tmp19_17 = new int[3];
    int[] tmp20_19 = tmp19_17;
    int[] tmp20_19 = tmp19_17;
    tmp20_19[0] = i;
    tmp20_19[1] = j;
    tmp20_19[2] = k;
    int[] arrayOfInt1 = tmp20_19;
    this.OooO00o = arrayOfInt1;
    i = 7;
    int[] arrayOfInt2 = new int[i];
    k = R.drawable.abc_ic_commit_search_api_mtrl_alpha;
    arrayOfInt2[0] = k;
    k = R.drawable.abc_seekbar_tick_mark_material;
    int m = 1;
    arrayOfInt2[m] = k;
    k = R.drawable.abc_ic_menu_share_mtrl_alpha;
    int n = 2;
    arrayOfInt2[n] = k;
    k = R.drawable.abc_ic_menu_copy_mtrl_am_alpha;
    int i1 = 3;
    arrayOfInt2[i1] = k;
    k = R.drawable.abc_ic_menu_cut_mtrl_alpha;
    int i2 = 4;
    arrayOfInt2[i2] = k;
    k = R.drawable.abc_ic_menu_selectall_mtrl_alpha;
    int i3 = 5;
    arrayOfInt2[i3] = k;
    k = R.drawable.abc_ic_menu_paste_mtrl_am_alpha;
    int i4 = 6;
    arrayOfInt2[i4] = k;
    this.OooO0O0 = arrayOfInt2;
    arrayOfInt1 = new int[i];
    j = R.drawable.abc_textfield_activated_mtrl_alpha;
    arrayOfInt1[0] = j;
    j = R.drawable.abc_textfield_search_activated_mtrl_alpha;
    arrayOfInt1[m] = j;
    j = R.drawable.abc_cab_background_top_mtrl_alpha;
    arrayOfInt1[n] = j;
    j = R.drawable.abc_text_cursor_material;
    arrayOfInt1[i1] = j;
    j = R.drawable.abc_text_select_handle_left_mtrl;
    arrayOfInt1[i2] = j;
    j = R.drawable.abc_text_select_handle_middle_mtrl;
    arrayOfInt1[i3] = j;
    j = R.drawable.abc_text_select_handle_right_mtrl;
    arrayOfInt1[i4] = j;
    this.OooO0OO = arrayOfInt1;
    i = R.drawable.abc_popup_background_mtrl_mult;
    j = R.drawable.abc_cab_background_internal_bg;
    k = R.drawable.abc_menu_hardkey_panel_mtrl_mult;
    int[] tmp235_233 = new int[3];
    int[] tmp236_235 = tmp235_233;
    int[] tmp236_235 = tmp235_233;
    tmp236_235[0] = i;
    tmp236_235[1] = j;
    tmp236_235[2] = k;
    arrayOfInt1 = tmp236_235;
    this.OooO0Oo = arrayOfInt1;
    i = R.drawable.abc_tab_indicator_material;
    j = R.drawable.abc_textfield_search_material;
    arrayOfInt1 = new int[] { i, j };
    this.OooO0o0 = arrayOfInt1;
    i = R.drawable.abc_btn_check_material;
    j = R.drawable.abc_btn_radio_material;
    k = R.drawable.abc_btn_check_material_anim;
    int i5 = R.drawable.abc_btn_radio_material_anim;
    int[] tmp301_299 = new int[4];
    int[] tmp302_301 = tmp301_299;
    int[] tmp302_301 = tmp301_299;
    tmp302_301[0] = i;
    tmp302_301[1] = j;
    tmp302_301[2] = k;
    int[] tmp312_302 = tmp302_301;
    tmp312_302[3] = i5;
    arrayOfInt1 = tmp312_302;
    this.OooO0o = arrayOfInt1;
  }
  
  public final ColorStateList OooO(Context paramContext)
  {
    int i = R.attr.colorButtonNormal;
    i = ThemeUtils.OooO0OO(paramContext, i);
    return OooO0oO(paramContext, i);
  }
  
  public boolean OooO00o(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    PorterDuff.Mode localMode = AppCompatDrawableManager.OooO00o();
    Object localObject = this.OooO00o;
    boolean bool1 = OooO0o0((int[])localObject, paramInt);
    int j = 1;
    float f = 1.4E-45F;
    boolean bool2 = false;
    int k = -1;
    if (bool1)
    {
      paramInt = R.attr.colorControlNormal;
      localObject = localMode;
    }
    int n;
    int m;
    for (boolean bool3 = j;; m = 0)
    {
      n = k;
      break label195;
      localObject = this.OooO0OO;
      bool1 = OooO0o0((int[])localObject, paramInt);
      if (bool1)
      {
        paramInt = R.attr.colorControlActivated;
        break;
      }
      localObject = this.OooO0Oo;
      bool1 = OooO0o0((int[])localObject, paramInt);
      m = 16842801;
      if (bool1) {
        localMode = PorterDuff.Mode.MULTIPLY;
      }
      int i;
      do
      {
        localObject = localMode;
        n = k;
        paramInt = m;
        m = j;
        break;
        i = R.drawable.abc_list_divider_mtrl_alpha;
        if (paramInt == i)
        {
          paramInt = Math.round(40.799999F);
          i = 16842800;
          m = j;
          n = paramInt;
          paramInt = i;
          localObject = localMode;
          break;
        }
        i = R.drawable.abc_dialog_material_background;
      } while (paramInt == i);
      localObject = localMode;
      paramInt = 0;
    }
    label195:
    if (m != 0)
    {
      bool2 = DrawableUtils.OooO00o(paramDrawable);
      if (bool2) {
        paramDrawable = paramDrawable.mutate();
      }
      int i1 = ThemeUtils.OooO0OO(paramContext, paramInt);
      paramContext = AppCompatDrawableManager.OooO0Oo(i1, (PorterDuff.Mode)localObject);
      paramDrawable.setColorFilter(paramContext);
      if (n != k) {
        paramDrawable.setAlpha(n);
      }
      return j;
    }
    return false;
  }
  
  public Drawable OooO0O0(ResourceManagerInternal paramResourceManagerInternal, Context paramContext, int paramInt)
  {
    int i = R.drawable.abc_cab_background_top_material;
    if (paramInt == i)
    {
      LayerDrawable localLayerDrawable = new android/graphics/drawable/LayerDrawable;
      Drawable[] arrayOfDrawable = new Drawable[2];
      int j = R.drawable.abc_cab_background_internal_bg;
      Drawable localDrawable = paramResourceManagerInternal.OooO0oo(paramContext, j);
      arrayOfDrawable[0] = localDrawable;
      j = R.drawable.abc_cab_background_top_mtrl_alpha;
      paramResourceManagerInternal = paramResourceManagerInternal.OooO0oo(paramContext, j);
      arrayOfDrawable[1] = paramResourceManagerInternal;
      localLayerDrawable.<init>(arrayOfDrawable);
      return localLayerDrawable;
    }
    i = R.drawable.abc_ratingbar_material;
    if (paramInt == i) {
      paramInt = R.dimen.abc_star_big;
    }
    for (;;)
    {
      return OooOO0O(paramResourceManagerInternal, paramContext, paramInt);
      i = R.drawable.abc_ratingbar_indicator_material;
      if (paramInt == i)
      {
        paramInt = R.dimen.abc_star_medium;
      }
      else
      {
        i = R.drawable.abc_ratingbar_small_material;
        if (paramInt != i) {
          break;
        }
        paramInt = R.dimen.abc_star_small;
      }
    }
    return null;
  }
  
  public ColorStateList OooO0OO(Context paramContext, int paramInt)
  {
    int i = R.drawable.abc_edit_text_material;
    if (paramInt == i)
    {
      paramInt = R.color.abc_tint_edittext;
      return AppCompatResources.OooO00o(paramContext, paramInt);
    }
    i = R.drawable.abc_switch_track_mtrl_alpha;
    if (paramInt == i)
    {
      paramInt = R.color.abc_tint_switch_track;
      return AppCompatResources.OooO00o(paramContext, paramInt);
    }
    i = R.drawable.abc_switch_thumb_material;
    if (paramInt == i) {
      return OooOO0(paramContext);
    }
    i = R.drawable.abc_btn_default_mtrl_shape;
    if (paramInt == i) {
      return OooO(paramContext);
    }
    i = R.drawable.abc_btn_borderless_material;
    if (paramInt == i) {
      return OooO0o(paramContext);
    }
    i = R.drawable.abc_btn_colored_material;
    if (paramInt == i) {
      return OooO0oo(paramContext);
    }
    i = R.drawable.abc_spinner_mtrl_am_alpha;
    if (paramInt != i)
    {
      i = R.drawable.abc_spinner_textfield_background_material;
      if (paramInt != i)
      {
        int[] arrayOfInt = this.OooO0O0;
        boolean bool = OooO0o0(arrayOfInt, paramInt);
        if (bool)
        {
          paramInt = R.attr.colorControlNormal;
          return ThemeUtils.OooO0o0(paramContext, paramInt);
        }
        arrayOfInt = this.OooO0o0;
        bool = OooO0o0(arrayOfInt, paramInt);
        if (bool)
        {
          paramInt = R.color.abc_tint_default;
          return AppCompatResources.OooO00o(paramContext, paramInt);
        }
        arrayOfInt = this.OooO0o;
        bool = OooO0o0(arrayOfInt, paramInt);
        if (bool)
        {
          paramInt = R.color.abc_tint_btn_checkable;
          return AppCompatResources.OooO00o(paramContext, paramInt);
        }
        int j = R.drawable.abc_seekbar_thumb_material;
        if (paramInt == j)
        {
          paramInt = R.color.abc_tint_seek_thumb;
          return AppCompatResources.OooO00o(paramContext, paramInt);
        }
        return null;
      }
    }
    paramInt = R.color.abc_tint_spinner;
    return AppCompatResources.OooO00o(paramContext, paramInt);
  }
  
  public boolean OooO0Oo(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    int i = R.drawable.abc_seekbar_track_material;
    boolean bool = true;
    int j = 16908301;
    int k = 16908303;
    int m = 16908288;
    Drawable localDrawable;
    PorterDuff.Mode localMode1;
    if (paramInt == i)
    {
      paramDrawable = (LayerDrawable)paramDrawable;
      localDrawable = paramDrawable.findDrawableByLayerId(m);
      i = R.attr.colorControlNormal;
      i = ThemeUtils.OooO0OO(paramContext, i);
      localMode1 = AppCompatDrawableManager.OooO00o();
      OooOO0o(localDrawable, i, localMode1);
      localDrawable = paramDrawable.findDrawableByLayerId(k);
    }
    for (i = R.attr.colorControlNormal;; i = R.attr.colorControlActivated)
    {
      i = ThemeUtils.OooO0OO(paramContext, i);
      PorterDuff.Mode localMode2 = AppCompatDrawableManager.OooO00o();
      OooOO0o(localDrawable, i, localMode2);
      localDrawable = paramDrawable.findDrawableByLayerId(j);
      int n = R.attr.colorControlActivated;
      int i1 = ThemeUtils.OooO0OO(paramContext, n);
      paramDrawable = AppCompatDrawableManager.OooO00o();
      OooOO0o(localDrawable, i1, paramDrawable);
      return bool;
      i = R.drawable.abc_ratingbar_material;
      if (paramInt != i)
      {
        i = R.drawable.abc_ratingbar_indicator_material;
        if (paramInt != i)
        {
          i = R.drawable.abc_ratingbar_small_material;
          if (paramInt != i) {
            return false;
          }
        }
      }
      paramDrawable = (LayerDrawable)paramDrawable;
      localDrawable = paramDrawable.findDrawableByLayerId(m);
      i = R.attr.colorControlNormal;
      i = ThemeUtils.OooO0O0(paramContext, i);
      localMode1 = AppCompatDrawableManager.OooO00o();
      OooOO0o(localDrawable, i, localMode1);
      localDrawable = paramDrawable.findDrawableByLayerId(k);
    }
  }
  
  public final ColorStateList OooO0o(Context paramContext)
  {
    return OooO0oO(paramContext, 0);
  }
  
  public final boolean OooO0o0(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    while (j < i)
    {
      int k = paramArrayOfInt[j];
      if (k == paramInt) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public final ColorStateList OooO0oO(Context paramContext, int paramInt)
  {
    int i = 4;
    int[][] arrayOfInt = new int[i][];
    int[] arrayOfInt1 = new int[i];
    int j = R.attr.colorControlHighlight;
    j = ThemeUtils.OooO0OO(paramContext, j);
    int k = R.attr.colorButtonNormal;
    int m = ThemeUtils.OooO0O0(paramContext, k);
    int[] arrayOfInt2 = ThemeUtils.OooO0O0;
    arrayOfInt[0] = arrayOfInt2;
    arrayOfInt1[0] = m;
    paramContext = ThemeUtils.OooO0o0;
    k = 1;
    arrayOfInt[k] = paramContext;
    m = ColorUtils.OooO0oO(j, paramInt);
    arrayOfInt1[k] = m;
    paramContext = ThemeUtils.OooO0OO;
    k = 2;
    arrayOfInt[k] = paramContext;
    m = ColorUtils.OooO0oO(j, paramInt);
    arrayOfInt1[k] = m;
    paramContext = ThemeUtils.OooO;
    j = 3;
    arrayOfInt[j] = paramContext;
    arrayOfInt1[j] = paramInt;
    paramContext = new android/content/res/ColorStateList;
    paramContext.<init>(arrayOfInt, arrayOfInt1);
    return paramContext;
  }
  
  public final ColorStateList OooO0oo(Context paramContext)
  {
    int i = R.attr.colorAccent;
    i = ThemeUtils.OooO0OO(paramContext, i);
    return OooO0oO(paramContext, i);
  }
  
  public final ColorStateList OooOO0(Context paramContext)
  {
    int i = 3;
    int[][] arrayOfInt = new int[i][];
    int[] arrayOfInt1 = new int[i];
    int j = R.attr.colorSwitchThumbNormal;
    Object localObject = ThemeUtils.OooO0o0(paramContext, j);
    int k = 2;
    int m = 1;
    int n = 0;
    int[] arrayOfInt2 = null;
    if (localObject != null)
    {
      boolean bool = ((ColorStateList)localObject).isStateful();
      if (bool)
      {
        int[] arrayOfInt3 = ThemeUtils.OooO0O0;
        arrayOfInt[0] = arrayOfInt3;
        int i1 = ((ColorStateList)localObject).getColorForState(arrayOfInt3, 0);
        arrayOfInt1[0] = i1;
        arrayOfInt2 = ThemeUtils.OooO0o;
        arrayOfInt[m] = arrayOfInt2;
        n = R.attr.colorControlActivated;
        i2 = ThemeUtils.OooO0OO(paramContext, n);
        arrayOfInt1[m] = i2;
        paramContext = ThemeUtils.OooO;
        arrayOfInt[k] = paramContext;
        i2 = ((ColorStateList)localObject).getDefaultColor();
        arrayOfInt1[k] = i2;
        break label228;
      }
    }
    localObject = ThemeUtils.OooO0O0;
    arrayOfInt[0] = localObject;
    j = R.attr.colorSwitchThumbNormal;
    j = ThemeUtils.OooO0O0(paramContext, j);
    arrayOfInt1[0] = j;
    localObject = ThemeUtils.OooO0o;
    arrayOfInt[m] = localObject;
    j = R.attr.colorControlActivated;
    j = ThemeUtils.OooO0OO(paramContext, j);
    arrayOfInt1[m] = j;
    localObject = ThemeUtils.OooO;
    arrayOfInt[k] = localObject;
    j = R.attr.colorSwitchThumbNormal;
    int i2 = ThemeUtils.OooO0OO(paramContext, j);
    arrayOfInt1[k] = i2;
    label228:
    paramContext = new android/content/res/ColorStateList;
    paramContext.<init>(arrayOfInt, arrayOfInt1);
    return paramContext;
  }
  
  public final LayerDrawable OooOO0O(ResourceManagerInternal paramResourceManagerInternal, Context paramContext, int paramInt)
  {
    paramInt = paramContext.getResources().getDimensionPixelSize(paramInt);
    int i = R.drawable.abc_star_black_48dp;
    Object localObject1 = paramResourceManagerInternal.OooO0oo(paramContext, i);
    int j = R.drawable.abc_star_half_black_48dp;
    paramResourceManagerInternal = paramResourceManagerInternal.OooO0oo(paramContext, j);
    boolean bool1 = localObject1 instanceof BitmapDrawable;
    j = 0;
    if (bool1)
    {
      int k = ((Drawable)localObject1).getIntrinsicWidth();
      if (k == paramInt)
      {
        k = ((Drawable)localObject1).getIntrinsicHeight();
        if (k == paramInt)
        {
          localObject1 = (BitmapDrawable)localObject1;
          paramContext = new android/graphics/drawable/BitmapDrawable;
          localObject2 = ((BitmapDrawable)localObject1).getBitmap();
          paramContext.<init>((Bitmap)localObject2);
          break label167;
        }
      }
    }
    paramContext = Bitmap.Config.ARGB_8888;
    paramContext = Bitmap.createBitmap(paramInt, paramInt, paramContext);
    Object localObject2 = new android/graphics/Canvas;
    ((Canvas)localObject2).<init>(paramContext);
    ((Drawable)localObject1).setBounds(0, 0, paramInt, paramInt);
    ((Drawable)localObject1).draw((Canvas)localObject2);
    localObject1 = new android/graphics/drawable/BitmapDrawable;
    ((BitmapDrawable)localObject1).<init>(paramContext);
    localObject2 = new android/graphics/drawable/BitmapDrawable;
    ((BitmapDrawable)localObject2).<init>(paramContext);
    paramContext = (Context)localObject2;
    label167:
    localObject2 = Shader.TileMode.REPEAT;
    paramContext.setTileModeX((Shader.TileMode)localObject2);
    boolean bool2 = paramResourceManagerInternal instanceof BitmapDrawable;
    if (bool2)
    {
      int m = ((Drawable)paramResourceManagerInternal).getIntrinsicWidth();
      if (m == paramInt)
      {
        m = ((Drawable)paramResourceManagerInternal).getIntrinsicHeight();
        if (m == paramInt)
        {
          paramResourceManagerInternal = (BitmapDrawable)paramResourceManagerInternal;
          break label283;
        }
      }
    }
    localObject2 = Bitmap.Config.ARGB_8888;
    localObject2 = Bitmap.createBitmap(paramInt, paramInt, (Bitmap.Config)localObject2);
    Canvas localCanvas = new android/graphics/Canvas;
    localCanvas.<init>((Bitmap)localObject2);
    ((Drawable)paramResourceManagerInternal).setBounds(0, 0, paramInt, paramInt);
    ((Drawable)paramResourceManagerInternal).draw(localCanvas);
    paramResourceManagerInternal = new android/graphics/drawable/BitmapDrawable;
    paramResourceManagerInternal.<init>((Bitmap)localObject2);
    label283:
    LayerDrawable localLayerDrawable = new android/graphics/drawable/LayerDrawable;
    localObject2 = new Drawable[3];
    localObject2[0] = localObject1;
    i = 1;
    localObject2[i] = paramResourceManagerInternal;
    int n = 2;
    localObject2[n] = paramContext;
    localLayerDrawable.<init>((Drawable[])localObject2);
    localLayerDrawable.setId(0, 16908288);
    localLayerDrawable.setId(i, 16908303);
    localLayerDrawable.setId(n, 16908301);
    return localLayerDrawable;
  }
  
  public final void OooOO0o(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    boolean bool = DrawableUtils.OooO00o(paramDrawable);
    if (bool) {
      paramDrawable = paramDrawable.mutate();
    }
    if (paramMode == null) {
      paramMode = AppCompatDrawableManager.OooO00o();
    }
    PorterDuffColorFilter localPorterDuffColorFilter = AppCompatDrawableManager.OooO0Oo(paramInt, paramMode);
    paramDrawable.setColorFilter(localPorterDuffColorFilter);
  }
  
  public PorterDuff.Mode getTintModeForDrawableRes(int paramInt)
  {
    int i = R.drawable.abc_switch_thumb_material;
    PorterDuff.Mode localMode;
    if (paramInt == i)
    {
      localMode = PorterDuff.Mode.MULTIPLY;
    }
    else
    {
      paramInt = 0;
      localMode = null;
    }
    return localMode;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatDrawableManager.1
 * JD-Core Version:    0.7.0.1
 */