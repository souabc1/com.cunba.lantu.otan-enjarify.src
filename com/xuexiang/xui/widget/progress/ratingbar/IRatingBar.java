package com.xuexiang.xui.widget.progress.ratingbar;

import android.graphics.drawable.Drawable;

abstract interface IRatingBar
{
  public abstract int getNumStars();
  
  public abstract float getRating();
  
  public abstract int getStarHeight();
  
  public abstract int getStarPadding();
  
  public abstract int getStarWidth();
  
  public abstract float getStepSize();
  
  public abstract boolean isClearRatingEnabled();
  
  public abstract boolean isClickable();
  
  public abstract boolean isIndicator();
  
  public abstract boolean isScrollable();
  
  public abstract void setClearRatingEnabled(boolean paramBoolean);
  
  public abstract void setClickable(boolean paramBoolean);
  
  public abstract void setEmptyDrawable(Drawable paramDrawable);
  
  public abstract void setEmptyDrawableRes(int paramInt);
  
  public abstract void setFilledDrawable(Drawable paramDrawable);
  
  public abstract void setFilledDrawableRes(int paramInt);
  
  public abstract void setIsIndicator(boolean paramBoolean);
  
  public abstract void setMinimumStars(float paramFloat);
  
  public abstract void setNumStars(int paramInt);
  
  public abstract void setRating(float paramFloat);
  
  public abstract void setScrollable(boolean paramBoolean);
  
  public abstract void setStarHeight(int paramInt);
  
  public abstract void setStarPadding(int paramInt);
  
  public abstract void setStarWidth(int paramInt);
  
  public abstract void setStepSize(float paramFloat);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.progress.ratingbar.IRatingBar
 * JD-Core Version:    0.7.0.1
 */