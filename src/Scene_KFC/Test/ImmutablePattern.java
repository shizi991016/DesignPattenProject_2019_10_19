package Test;

import Class.pack.Packing;
import Class.product.BigMac;

import java.lang.reflect.Parameter;

public class ImmutablePattern {
    public static void main(String[] args) {
        BigMac bigmac=new BigMac();
        Packing wrapper=bigmac.packing();
        System.out.println(wrapper.getMaterial());
        wrapper.setMaterial();
        System.out.println(wrapper.getMaterial());





    }
}
