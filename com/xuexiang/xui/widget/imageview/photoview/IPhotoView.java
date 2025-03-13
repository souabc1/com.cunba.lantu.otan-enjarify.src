package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView.ScaleType;

public abstract interface IPhotoView
{
  public abstract RectF getDisplayRect();
  
  public abstract IPhotoView getIPhotoViewImplementation();
  
  public abstract float getMaximumScale();
  
  public abstract float getMediumScale();
  
  public abstract float getMinimumScale();
  
  public abstract float getScale();
  
  public abstract ImageView.ScaleType getScaleType();
  
  public abstract Bitmap getVisibleRectangleBitmap();
  
  public abstract void setAllowParentInterceptOnEdge(boolean paramBoolean);
  
  public abstract void setMaximumScale(float paramFloat);
  
  public abstract void setMediumScale(float paramFloat);
  
  public abstract void setMinimumScale(float paramFloat);
  
  public abstract void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener);
  
  public abstract void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener);
  
  public abstract void setOnMatrixChangeListener(PhotoViewAttacher.OnMatrixChangedListener paramOnMatrixChangedListener);
  
  public abstract void setOnPhotoTapListener(PhotoViewAttacher.OnPhotoTapListener paramOnPhotoTapListener);
  
  public abstract void setOnScaleChangeListener(PhotoViewAttacher.OnScaleChangeListener paramOnScaleChangeListener);
  
  public abstract void setOnSingleFlingListener(PhotoViewAttacher.OnSingleFlingListener paramOnSingleFlingListener);
  
  public abstract void setOnViewTapListener(PhotoViewAttacher.OnViewTapListener paramOnViewTapListener);
  
  public abstract void setRotationBy(float paramFloat);
  
  public abstract void setRotationTo(float paramFloat);
  
  public abstract void setScale(float paramFloat);
  
  public abstract void setScaleType(ImageView.ScaleType paramScaleType);
  
  public abstract void setZoomTransitionDuration(int paramInt);
  
  public abstract void setZoomable(boolean paramBoolean);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.photoview.IPhotoView
 * JD-Core Version:    0.7.0.1
 */