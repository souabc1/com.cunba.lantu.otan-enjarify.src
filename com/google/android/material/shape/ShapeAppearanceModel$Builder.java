package com.google.android.material.shape;

public final class ShapeAppearanceModel$Builder
{
  private EdgeTreatment bottomEdge;
  private CornerTreatment bottomLeftCorner;
  private CornerSize bottomLeftCornerSize;
  private CornerTreatment bottomRightCorner;
  private CornerSize bottomRightCornerSize;
  private EdgeTreatment leftEdge;
  private EdgeTreatment rightEdge;
  private EdgeTreatment topEdge;
  private CornerTreatment topLeftCorner;
  private CornerSize topLeftCornerSize;
  private CornerTreatment topRightCorner;
  private CornerSize topRightCornerSize;
  
  public ShapeAppearanceModel$Builder()
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
  
  public ShapeAppearanceModel$Builder(ShapeAppearanceModel paramShapeAppearanceModel)
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
    localObject = paramShapeAppearanceModel.topLeftCorner;
    this.topLeftCorner = ((CornerTreatment)localObject);
    localObject = paramShapeAppearanceModel.topRightCorner;
    this.topRightCorner = ((CornerTreatment)localObject);
    localObject = paramShapeAppearanceModel.bottomRightCorner;
    this.bottomRightCorner = ((CornerTreatment)localObject);
    localObject = paramShapeAppearanceModel.bottomLeftCorner;
    this.bottomLeftCorner = ((CornerTreatment)localObject);
    localObject = paramShapeAppearanceModel.topLeftCornerSize;
    this.topLeftCornerSize = ((CornerSize)localObject);
    localObject = paramShapeAppearanceModel.topRightCornerSize;
    this.topRightCornerSize = ((CornerSize)localObject);
    localObject = paramShapeAppearanceModel.bottomRightCornerSize;
    this.bottomRightCornerSize = ((CornerSize)localObject);
    localObject = paramShapeAppearanceModel.bottomLeftCornerSize;
    this.bottomLeftCornerSize = ((CornerSize)localObject);
    localObject = paramShapeAppearanceModel.topEdge;
    this.topEdge = ((EdgeTreatment)localObject);
    localObject = paramShapeAppearanceModel.rightEdge;
    this.rightEdge = ((EdgeTreatment)localObject);
    localObject = paramShapeAppearanceModel.bottomEdge;
    this.bottomEdge = ((EdgeTreatment)localObject);
    paramShapeAppearanceModel = paramShapeAppearanceModel.leftEdge;
    this.leftEdge = paramShapeAppearanceModel;
  }
  
  private static float compatCornerTreatmentSize(CornerTreatment paramCornerTreatment)
  {
    boolean bool = paramCornerTreatment instanceof RoundedCornerTreatment;
    if (bool) {
      return ((RoundedCornerTreatment)paramCornerTreatment).radius;
    }
    bool = paramCornerTreatment instanceof CutCornerTreatment;
    if (bool) {
      return ((CutCornerTreatment)paramCornerTreatment).size;
    }
    return -1.0F;
  }
  
  public ShapeAppearanceModel build()
  {
    ShapeAppearanceModel localShapeAppearanceModel = new com/google/android/material/shape/ShapeAppearanceModel;
    localShapeAppearanceModel.<init>(this, null);
    return localShapeAppearanceModel;
  }
  
  public Builder setAllCornerSizes(float paramFloat)
  {
    return setTopLeftCornerSize(paramFloat).setTopRightCornerSize(paramFloat).setBottomRightCornerSize(paramFloat).setBottomLeftCornerSize(paramFloat);
  }
  
  public Builder setAllCornerSizes(CornerSize paramCornerSize)
  {
    return setTopLeftCornerSize(paramCornerSize).setTopRightCornerSize(paramCornerSize).setBottomRightCornerSize(paramCornerSize).setBottomLeftCornerSize(paramCornerSize);
  }
  
  public Builder setAllCorners(int paramInt, float paramFloat)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setAllCorners(localCornerTreatment).setAllCornerSizes(paramFloat);
  }
  
  public Builder setAllCorners(CornerTreatment paramCornerTreatment)
  {
    return setTopLeftCorner(paramCornerTreatment).setTopRightCorner(paramCornerTreatment).setBottomRightCorner(paramCornerTreatment).setBottomLeftCorner(paramCornerTreatment);
  }
  
  public Builder setAllEdges(EdgeTreatment paramEdgeTreatment)
  {
    return setLeftEdge(paramEdgeTreatment).setTopEdge(paramEdgeTreatment).setRightEdge(paramEdgeTreatment).setBottomEdge(paramEdgeTreatment);
  }
  
  public Builder setBottomEdge(EdgeTreatment paramEdgeTreatment)
  {
    this.bottomEdge = paramEdgeTreatment;
    return this;
  }
  
  public Builder setBottomLeftCorner(int paramInt, float paramFloat)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setBottomLeftCorner(localCornerTreatment).setBottomLeftCornerSize(paramFloat);
  }
  
  public Builder setBottomLeftCorner(int paramInt, CornerSize paramCornerSize)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setBottomLeftCorner(localCornerTreatment).setBottomLeftCornerSize(paramCornerSize);
  }
  
  public Builder setBottomLeftCorner(CornerTreatment paramCornerTreatment)
  {
    this.bottomLeftCorner = paramCornerTreatment;
    float f1 = compatCornerTreatmentSize(paramCornerTreatment);
    float f2 = -1.0F;
    boolean bool = f1 < f2;
    if (bool) {
      setBottomLeftCornerSize(f1);
    }
    return this;
  }
  
  public Builder setBottomLeftCornerSize(float paramFloat)
  {
    AbsoluteCornerSize localAbsoluteCornerSize = new com/google/android/material/shape/AbsoluteCornerSize;
    localAbsoluteCornerSize.<init>(paramFloat);
    this.bottomLeftCornerSize = localAbsoluteCornerSize;
    return this;
  }
  
  public Builder setBottomLeftCornerSize(CornerSize paramCornerSize)
  {
    this.bottomLeftCornerSize = paramCornerSize;
    return this;
  }
  
  public Builder setBottomRightCorner(int paramInt, float paramFloat)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setBottomRightCorner(localCornerTreatment).setBottomRightCornerSize(paramFloat);
  }
  
  public Builder setBottomRightCorner(int paramInt, CornerSize paramCornerSize)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setBottomRightCorner(localCornerTreatment).setBottomRightCornerSize(paramCornerSize);
  }
  
  public Builder setBottomRightCorner(CornerTreatment paramCornerTreatment)
  {
    this.bottomRightCorner = paramCornerTreatment;
    float f1 = compatCornerTreatmentSize(paramCornerTreatment);
    float f2 = -1.0F;
    boolean bool = f1 < f2;
    if (bool) {
      setBottomRightCornerSize(f1);
    }
    return this;
  }
  
  public Builder setBottomRightCornerSize(float paramFloat)
  {
    AbsoluteCornerSize localAbsoluteCornerSize = new com/google/android/material/shape/AbsoluteCornerSize;
    localAbsoluteCornerSize.<init>(paramFloat);
    this.bottomRightCornerSize = localAbsoluteCornerSize;
    return this;
  }
  
  public Builder setBottomRightCornerSize(CornerSize paramCornerSize)
  {
    this.bottomRightCornerSize = paramCornerSize;
    return this;
  }
  
  public Builder setLeftEdge(EdgeTreatment paramEdgeTreatment)
  {
    this.leftEdge = paramEdgeTreatment;
    return this;
  }
  
  public Builder setRightEdge(EdgeTreatment paramEdgeTreatment)
  {
    this.rightEdge = paramEdgeTreatment;
    return this;
  }
  
  public Builder setTopEdge(EdgeTreatment paramEdgeTreatment)
  {
    this.topEdge = paramEdgeTreatment;
    return this;
  }
  
  public Builder setTopLeftCorner(int paramInt, float paramFloat)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setTopLeftCorner(localCornerTreatment).setTopLeftCornerSize(paramFloat);
  }
  
  public Builder setTopLeftCorner(int paramInt, CornerSize paramCornerSize)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setTopLeftCorner(localCornerTreatment).setTopLeftCornerSize(paramCornerSize);
  }
  
  public Builder setTopLeftCorner(CornerTreatment paramCornerTreatment)
  {
    this.topLeftCorner = paramCornerTreatment;
    float f1 = compatCornerTreatmentSize(paramCornerTreatment);
    float f2 = -1.0F;
    boolean bool = f1 < f2;
    if (bool) {
      setTopLeftCornerSize(f1);
    }
    return this;
  }
  
  public Builder setTopLeftCornerSize(float paramFloat)
  {
    AbsoluteCornerSize localAbsoluteCornerSize = new com/google/android/material/shape/AbsoluteCornerSize;
    localAbsoluteCornerSize.<init>(paramFloat);
    this.topLeftCornerSize = localAbsoluteCornerSize;
    return this;
  }
  
  public Builder setTopLeftCornerSize(CornerSize paramCornerSize)
  {
    this.topLeftCornerSize = paramCornerSize;
    return this;
  }
  
  public Builder setTopRightCorner(int paramInt, float paramFloat)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setTopRightCorner(localCornerTreatment).setTopRightCornerSize(paramFloat);
  }
  
  public Builder setTopRightCorner(int paramInt, CornerSize paramCornerSize)
  {
    CornerTreatment localCornerTreatment = MaterialShapeUtils.createCornerTreatment(paramInt);
    return setTopRightCorner(localCornerTreatment).setTopRightCornerSize(paramCornerSize);
  }
  
  public Builder setTopRightCorner(CornerTreatment paramCornerTreatment)
  {
    this.topRightCorner = paramCornerTreatment;
    float f1 = compatCornerTreatmentSize(paramCornerTreatment);
    float f2 = -1.0F;
    boolean bool = f1 < f2;
    if (bool) {
      setTopRightCornerSize(f1);
    }
    return this;
  }
  
  public Builder setTopRightCornerSize(float paramFloat)
  {
    AbsoluteCornerSize localAbsoluteCornerSize = new com/google/android/material/shape/AbsoluteCornerSize;
    localAbsoluteCornerSize.<init>(paramFloat);
    this.topRightCornerSize = localAbsoluteCornerSize;
    return this;
  }
  
  public Builder setTopRightCornerSize(CornerSize paramCornerSize)
  {
    this.topRightCornerSize = paramCornerSize;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.ShapeAppearanceModel.Builder
 * JD-Core Version:    0.7.0.1
 */