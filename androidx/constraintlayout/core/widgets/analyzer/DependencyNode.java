package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DependencyNode
  implements Dependency
{
  public DimensionDependency OooO;
  public Dependency OooO00o = null;
  public boolean OooO0O0 = false;
  public boolean OooO0OO = false;
  public WidgetRun OooO0Oo;
  public int OooO0o;
  public DependencyNode.Type OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  public boolean OooOO0;
  public List OooOO0O;
  public List OooOO0o;
  
  public DependencyNode(WidgetRun paramWidgetRun)
  {
    DependencyNode.Type localType = DependencyNode.Type.o00OoOoo;
    this.OooO0o0 = localType;
    this.OooO0oo = 1;
    this.OooO = null;
    this.OooOO0 = false;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooOO0O = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooOO0o = localArrayList;
    this.OooO0Oo = paramWidgetRun;
  }
  
  public void OooO00o(Dependency paramDependency)
  {
    paramDependency = this.OooOO0o.iterator();
    do
    {
      bool1 = paramDependency.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (DependencyNode)paramDependency.next();
      bool1 = ((DependencyNode)localObject1).OooOO0;
    } while (bool1);
    return;
    int j = 1;
    this.OooO0OO = j;
    Object localObject1 = this.OooO00o;
    if (localObject1 != null) {
      ((Dependency)localObject1).OooO00o(this);
    }
    boolean bool1 = this.OooO0O0;
    if (bool1)
    {
      this.OooO0Oo.OooO00o(this);
      return;
    }
    localObject1 = this.OooOO0o.iterator();
    Object localObject2 = null;
    int m = 0;
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      DependencyNode localDependencyNode = (DependencyNode)((Iterator)localObject1).next();
      boolean bool3 = localDependencyNode instanceof DimensionDependency;
      if (!bool3)
      {
        m += 1;
        localObject2 = localDependencyNode;
      }
    }
    if ((localObject2 != null) && (m == j))
    {
      j = localObject2.OooOO0;
      if (j != 0)
      {
        paramDependency = this.OooO;
        if (paramDependency != null)
        {
          bool1 = paramDependency.OooOO0;
          if (bool1)
          {
            i = this.OooO0oo;
            k = paramDependency.OooO0oO;
            i *= k;
            this.OooO0o = i;
          }
          else
          {
            return;
          }
        }
        int k = localObject2.OooO0oO;
        int i = this.OooO0o;
        k += i;
        OooO0Oo(k);
      }
    }
    paramDependency = this.OooO00o;
    if (paramDependency != null) {
      paramDependency.OooO00o(this);
    }
  }
  
  public void OooO0O0(Dependency paramDependency)
  {
    List localList = this.OooOO0O;
    localList.add(paramDependency);
    boolean bool = this.OooOO0;
    if (bool) {
      paramDependency.OooO00o(paramDependency);
    }
  }
  
  public void OooO0OO()
  {
    this.OooOO0o.clear();
    this.OooOO0O.clear();
    this.OooOO0 = false;
    this.OooO0oO = 0;
    this.OooO0OO = false;
    this.OooO0O0 = false;
  }
  
  public void OooO0Oo(int paramInt)
  {
    boolean bool = this.OooOO0;
    if (bool) {
      return;
    }
    bool = true;
    this.OooOO0 = bool;
    this.OooO0oO = paramInt;
    Iterator localIterator = this.OooOO0O.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Dependency localDependency = (Dependency)localIterator.next();
      localDependency.OooO00o(localDependency);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.OooO0Oo.OooO0O0.getDebugName();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(":");
    localObject = this.OooO0o0;
    localStringBuilder.append(localObject);
    localObject = "(";
    localStringBuilder.append((String)localObject);
    boolean bool = this.OooOO0;
    if (bool)
    {
      i = this.OooO0oO;
      localObject = Integer.valueOf(i);
    }
    else
    {
      localObject = "unresolved";
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(") <t=");
    int i = this.OooOO0o.size();
    localStringBuilder.append(i);
    localStringBuilder.append(":d=");
    i = this.OooOO0O.size();
    localStringBuilder.append(i);
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.DependencyNode
 * JD-Core Version:    0.7.0.1
 */