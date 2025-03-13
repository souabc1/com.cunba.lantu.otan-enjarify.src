package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R.styleable;

public class ShapeAppearanceModel
{
  public static final CornerSize PILL;
  EdgeTreatment bottomEdge;
  CornerTreatment bottomLeftCorner;
  CornerSize bottomLeftCornerSize;
  CornerTreatment bottomRightCorner;
  CornerSize bottomRightCornerSize;
  EdgeTreatment leftEdge;
  EdgeTreatment rightEdge;
  EdgeTreatment topEdge;
  CornerTreatment topLeftCorner;
  CornerSize topLeftCornerSize;
  CornerTreatment topRightCorner;
  CornerSize topRightCornerSize;
  
  static
  {
    RelativeCornerSize localRelativeCornerSize = new com/google/android/material/shape/RelativeCornerSize;
    localRelativeCornerSize.<init>(0.5F);
    PILL = localRelativeCornerSize;
  }
  
  public ShapeAppearanceModel()
  {
    Object localObject = MaterialShapeUtils.createDefaultCornerTreatment();
    this.topLeftCorner = ((CornerTreatment)localObject);
    localObject = MaterialShapeUtils.createDefaultCornerTreatment();
    this.topRightCorner = ((CornerTreatment)localObject);
    localObject = MaterialShapeUtils.createDefaultCornerTreatment();
    this.bottomRightCorner = ((CornerTreatment)localObject);
    localObject = MaterialShapeUtils.createDefaultCornerTreatment();
    this.bottomLeftCorner = ((CornerTreatment)localObject);
    localObject = new com/google/android/material/shape/AbsoluteCornerSize;
    ((AbsoluteCornerSize)localObject).<init>(0.0F);
    this.topLeftCornerSize = ((CornerSize)localObject);
    localObject = new com/google/android/material/shape/AbsoluteCornerSize;
    ((AbsoluteCornerSize)localObject).<init>(0.0F);
    this.topRightCornerSize = ((CornerSize)localObject);
    localObject = new com/google/android/material/shape/AbsoluteCornerSize;
    ((AbsoluteCornerSize)localObject).<init>(0.0F);
    this.bottomRightCornerSize = ((CornerSize)localObject);
    localObject = new com/google/android/material/shape/AbsoluteCornerSize;
    ((AbsoluteCornerSize)localObject).<init>(0.0F);
    this.bottomLeftCornerSize = ((CornerSize)localObject);
    localObject = MaterialShapeUtils.createDefaultEdgeTreatment();
    this.topEdge = ((EdgeTreatment)localObject);
    localObject = MaterialShapeUtils.createDefaultEdgeTreatment();
    this.rightEdge = ((EdgeTreatment)localObject);
    localObject = MaterialShapeUtils.createDefaultEdgeTreatment();
    this.bottomEdge = ((EdgeTreatment)localObject);
    localObject = MaterialShapeUtils.createDefaultEdgeTreatment();
    this.leftEdge = ((EdgeTreatment)localObject);
  }
  
  private ShapeAppearanceModel(ShapeAppearanceModel.Builder paramBuilder)
  {
    Object localObject = ShapeAppearanceModel.Builder.access$100(paramBuilder);
    this.topLeftCorner = ((CornerTreatment)localObject);
    localObject = ShapeAppearanceModel.Builder.access$200(paramBuilder);
    this.topRightCorner = ((CornerTreatment)localObject);
    localObject = ShapeAppearanceModel.Builder.access$300(paramBuilder);
    this.bottomRightCorner = ((CornerTreatment)localObject);
    localObject = ShapeAppearanceModel.Builder.access$400(paramBuilder);
    this.bottomLeftCorner = ((CornerTreatment)localObject);
    localObject = ShapeAppearanceModel.Builder.access$500(paramBuilder);
    this.topLeftCornerSize = ((CornerSize)localObject);
    localObject = ShapeAppearanceModel.Builder.access$600(paramBuilder);
    this.topRightCornerSize = ((CornerSize)localObject);
    localObject = ShapeAppearanceModel.Builder.access$700(paramBuilder);
    this.bottomRightCornerSize = ((CornerSize)localObject);
    localObject = ShapeAppearanceModel.Builder.access$800(paramBuilder);
    this.bottomLeftCornerSize = ((CornerSize)localObject);
    localObject = ShapeAppearanceModel.Builder.access$900(paramBuilder);
    this.topEdge = ((EdgeTreatment)localObject);
    localObject = ShapeAppearanceModel.Builder.access$1000(paramBuilder);
    this.rightEdge = ((EdgeTreatment)localObject);
    localObject = ShapeAppearanceModel.Builder.access$1100(paramBuilder);
    this.bottomEdge = ((EdgeTreatment)localObject);
    paramBuilder = ShapeAppearanceModel.Builder.access$1200(paramBuilder);
    this.leftEdge = paramBuilder;
  }
  
  public static ShapeAppearanceModel.Builder builder()
  {
    ShapeAppearanceModel.Builder localBuilder = new com/google/android/material/shape/ShapeAppearanceModel$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  public static ShapeAppearanceModel.Builder builder(Context paramContext, int paramInt1, int paramInt2)
  {
    return builder(paramContext, paramInt1, paramInt2, 0);
  }
  
  private static ShapeAppearanceModel.Builder builder(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    AbsoluteCornerSize localAbsoluteCornerSize = new com/google/android/material/shape/AbsoluteCornerSize;
    float f = paramInt3;
    localAbsoluteCornerSize.<init>(f);
    return builder(paramContext, paramInt1, paramInt2, localAbsoluteCornerSize);
  }
  
  private static ShapeAppearanceModel.Builder builder(Context paramContext, int paramInt1, int paramInt2, CornerSize paramCornerSize)
  {
    Object localObject1 = new android/view/ContextThemeWrapper;
    ((ContextThemeWrapper)localObject1).<init>(paramContext, paramInt1);
    if (paramInt2 != 0)
    {
      paramContext = new android/view/ContextThemeWrapper;
      paramContext.<init>((Context)localObject1, paramInt2);
      localObject1 = paramContext;
    }
    paramContext = R.styleable.ShapeAppearance;
    paramContext = ((Context)localObject1).obtainStyledAttributes(paramContext);
    try
    {
      paramInt1 = R.styleable.ShapeAppearance_cornerFamily;
      paramInt2 = 0;
      ShapeAppearanceModel.Builder localBuilder1 = null;
      paramInt1 = paramContext.getInt(paramInt1, 0);
      paramInt2 = R.styleable.ShapeAppearance_cornerFamilyTopLeft;
      paramInt2 = paramContext.getInt(paramInt2, paramInt1);
      int i = R.styleable.ShapeAppearance_cornerFamilyTopRight;
      i = paramContext.getInt(i, paramInt1);
      int j = R.styleable.ShapeAppearance_cornerFamilyBottomRight;
      j = paramContext.getInt(j, paramInt1);
      int k = R.styleable.ShapeAppearance_cornerFamilyBottomLeft;
      paramInt1 = paramContext.getInt(k, paramInt1);
      k = R.styleable.ShapeAppearance_cornerSize;
      paramCornerSize = getCornerSize(paramContext, k, paramCornerSize);
      k = R.styleable.ShapeAppearance_cornerSizeTopLeft;
      CornerSize localCornerSize1 = getCornerSize(paramContext, k, paramCornerSize);
      int m = R.styleable.ShapeAppearance_cornerSizeTopRight;
      CornerSize localCornerSize2 = getCornerSize(paramContext, m, paramCornerSize);
      int n = R.styleable.ShapeAppearance_cornerSizeBottomRight;
      CornerSize localCornerSize3 = getCornerSize(paramContext, n, paramCornerSize);
      int i1 = R.styleable.ShapeAppearance_cornerSizeBottomLeft;
      paramCornerSize = getCornerSize(paramContext, i1, paramCornerSize);
      ShapeAppearanceModel.Builder localBuilder2 = new com/google/android/material/shape/ShapeAppearanceModel$Builder;
      localBuilder2.<init>();
      localBuilder1 = localBuilder2.setTopLeftCorner(paramInt2, localCornerSize1);
      localBuilder1 = localBuilder1.setTopRightCorner(i, localCornerSize2);
      localBuilder1 = localBuilder1.setBottomRightCorner(j, localCornerSize3);
      ShapeAppearanceModel.Builder localBuilder3 = localBuilder1.setBottomLeftCorner(paramInt1, paramCornerSize);
      return localBuilder3;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static ShapeAppearanceModel.Builder builder(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    return builder(paramContext, paramAttributeSet, paramInt1, paramInt2, 0);
  }
  
  public static ShapeAppearanceModel.Builder builder(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, int paramInt3)
  {
    AbsoluteCornerSize localAbsoluteCornerSize = new com/google/android/material/shape/AbsoluteCornerSize;
    float f = paramInt3;
    localAbsoluteCornerSize.<init>(f);
    return builder(paramContext, paramAttributeSet, paramInt1, paramInt2, localAbsoluteCornerSize);
  }
  
  public static ShapeAppearanceModel.Builder builder(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, CornerSize paramCornerSize)
  {
    int[] arrayOfInt = R.styleable.MaterialShape;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
    paramInt1 = R.styleable.MaterialShape_shapeAppearance;
    paramInt1 = paramAttributeSet.getResourceId(paramInt1, 0);
    int i = R.styleable.MaterialShape_shapeAppearanceOverlay;
    paramInt2 = paramAttributeSet.getResourceId(i, 0);
    paramAttributeSet.recycle();
    return builder(paramContext, paramInt1, paramInt2, paramCornerSize);
  }
  
  private static CornerSize getCornerSize(TypedArray paramTypedArray, int paramInt, CornerSize paramCornerSize)
  {
    TypedValue localTypedValue = paramTypedArray.peekValue(paramInt);
    if (localTypedValue == null) {
      return paramCornerSize;
    }
    int i = localTypedValue.type;
    int j = 5;
    if (i == j)
    {
      paramCornerSize = new com/google/android/material/shape/AbsoluteCornerSize;
      paramInt = localTypedValue.data;
      paramTypedArray = paramTypedArray.getResources().getDisplayMetrics();
      f1 = TypedValue.complexToDimensionPixelSize(paramInt, paramTypedArray);
      paramCornerSize.<init>(f1);
      return paramCornerSize;
    }
    int k = 6;
    float f1 = 8.407791E-045F;
    if (i == k)
    {
      paramTypedArray = new com/google/android/material/shape/RelativeCornerSize;
      float f2 = 1.0F;
      float f3 = localTypedValue.getFraction(f2, f2);
      paramTypedArray.<init>(f3);
      return paramTypedArray;
    }
    return paramCornerSize;
  }
  
  public EdgeTreatment getBottomEdge()
  {
    return this.bottomEdge;
  }
  
  public CornerTreatment getBottomLeftCorner()
  {
    return this.bottomLeftCorner;
  }
  
  public CornerSize getBottomLeftCornerSize()
  {
    return this.bottomLeftCornerSize;
  }
  
  public CornerTreatment getBottomRightCorner()
  {
    return this.bottomRightCorner;
  }
  
  public CornerSize getBottomRightCornerSize()
  {
    return this.bottomRightCornerSize;
  }
  
  public EdgeTreatment getLeftEdge()
  {
    return this.leftEdge;
  }
  
  public EdgeTreatment getRightEdge()
  {
    return this.rightEdge;
  }
  
  public EdgeTreatment getTopEdge()
  {
    return this.topEdge;
  }
  
  public CornerTreatment getTopLeftCorner()
  {
    return this.topLeftCorner;
  }
  
  public CornerSize getTopLeftCornerSize()
  {
    return this.topLeftCornerSize;
  }
  
  public CornerTreatment getTopRightCorner()
  {
    return this.topRightCorner;
  }
  
  public CornerSize getTopRightCornerSize()
  {
    return this.topRightCornerSize;
  }
  
  public boolean isRoundRect(RectF paramRectF)
  {
    Class localClass = this.leftEdge.getClass();
    Object localObject = EdgeTreatment.class;
    boolean bool1 = localClass.equals(localObject);
    boolean bool2 = true;
    float f1 = 1.4E-45F;
    if (bool1)
    {
      localClass = this.rightEdge.getClass();
      bool1 = localClass.equals(localObject);
      if (bool1)
      {
        localClass = this.topEdge.getClass();
        bool1 = localClass.equals(localObject);
        if (bool1)
        {
          localClass = this.bottomEdge.getClass();
          bool1 = localClass.equals(localObject);
          if (bool1)
          {
            bool1 = bool2;
            break label104;
          }
        }
      }
    }
    bool1 = false;
    localClass = null;
    label104:
    localObject = this.topLeftCornerSize;
    float f2 = ((CornerSize)localObject).getCornerSize(paramRectF);
    CornerSize localCornerSize = this.topRightCornerSize;
    float f3 = localCornerSize.getCornerSize(paramRectF);
    boolean bool3 = f3 < f2;
    if (!bool3)
    {
      localCornerSize = this.bottomLeftCornerSize;
      f3 = localCornerSize.getCornerSize(paramRectF);
      bool3 = f3 < f2;
      if (!bool3)
      {
        localCornerSize = this.bottomRightCornerSize;
        f4 = localCornerSize.getCornerSize(paramRectF);
        bool4 = f4 < f2;
        if (!bool4)
        {
          bool4 = bool2;
          f4 = f1;
          break label221;
        }
      }
    }
    boolean bool4 = false;
    paramRectF = null;
    float f4 = 0.0F;
    label221:
    localObject = this.topRightCorner;
    boolean bool5 = localObject instanceof RoundedCornerTreatment;
    if (bool5)
    {
      localObject = this.topLeftCorner;
      bool5 = localObject instanceof RoundedCornerTreatment;
      if (bool5)
      {
        localObject = this.bottomRightCorner;
        bool5 = localObject instanceof RoundedCornerTreatment;
        if (bool5)
        {
          localObject = this.bottomLeftCorner;
          bool5 = localObject instanceof RoundedCornerTreatment;
          if (bool5)
          {
            bool5 = bool2;
            f2 = f1;
            break label304;
          }
        }
      }
    }
    bool5 = false;
    localObject = null;
    f2 = 0.0F;
    label304:
    if ((!bool1) || (!bool4) || (!bool5))
    {
      bool2 = false;
      f1 = 0.0F;
    }
    return bool2;
  }
  
  public ShapeAppearanceModel.Builder toBuilder()
  {
    ShapeAppearanceModel.Builder localBuilder = new com/google/android/material/shape/ShapeAppearanceModel$Builder;
    localBuilder.<init>(this);
    return localBuilder;
  }
  
  public ShapeAppearanceModel withCornerSize(float paramFloat)
  {
    return toBuilder().setAllCornerSizes(paramFloat).build();
  }
  
  public ShapeAppearanceModel withCornerSize(CornerSize paramCornerSize)
  {
    return toBuilder().setAllCornerSizes(paramCornerSize).build();
  }
  
  public ShapeAppearanceModel withTransformedCornerSizes(ShapeAppearanceModel.CornerSizeUnaryOperator paramCornerSizeUnaryOperator)
  {
    ShapeAppearanceModel.Builder localBuilder = toBuilder();
    CornerSize localCornerSize = getTopLeftCornerSize();
    localCornerSize = paramCornerSizeUnaryOperator.apply(localCornerSize);
    localBuilder = localBuilder.setTopLeftCornerSize(localCornerSize);
    localCornerSize = getTopRightCornerSize();
    localCornerSize = paramCornerSizeUnaryOperator.apply(localCornerSize);
    localBuilder = localBuilder.setTopRightCornerSize(localCornerSize);
    localCornerSize = getBottomLeftCornerSize();
    localCornerSize = paramCornerSizeUnaryOperator.apply(localCornerSize);
    localBuilder = localBuilder.setBottomLeftCornerSize(localCornerSize);
    localCornerSize = getBottomRightCornerSize();
    paramCornerSizeUnaryOperator = paramCornerSizeUnaryOperator.apply(localCornerSize);
    return localBuilder.setBottomRightCornerSize(paramCornerSizeUnaryOperator).build();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.ShapeAppearanceModel
 * JD-Core Version:    0.7.0.1
 */