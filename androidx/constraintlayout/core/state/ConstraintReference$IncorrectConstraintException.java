package androidx.constraintlayout.core.state;

import java.util.ArrayList;

class ConstraintReference$IncorrectConstraintException
  extends Exception
{
  public final ArrayList o00OoOoo;
  
  public ArrayList getErrors()
  {
    return this.o00OoOoo;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("IncorrectConstraintException: ");
    String str = this.o00OoOoo.toString();
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.ConstraintReference.IncorrectConstraintException
 * JD-Core Version:    0.7.0.1
 */