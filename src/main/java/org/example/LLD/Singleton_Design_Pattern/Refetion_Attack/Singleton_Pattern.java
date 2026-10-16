import org.example.LLD.Singleton_Design_Pattern.Refetion_Attack.Brower;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

void main() {
    Brower instance1 = Brower.getInstance();
    Brower instance2 = null;
    try {
        Constructor<Brower>  constr = Brower.class.getDeclaredConstructor();
        constr.setAccessible(true);
        instance2 = constr.newInstance();
        System.out.println("Hashcode of instance : "+instance2.hashCode());
        System.out.println("Hashcode of instance : "+instance1.hashCode());
    } catch (NoSuchMethodException e) {
        e.printStackTrace();
    } catch (SecurityException e) {
        e.printStackTrace();
    } catch (InstantiationException e){
        e.printStackTrace();
    } catch (InvocationTargetException e){
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    }
}