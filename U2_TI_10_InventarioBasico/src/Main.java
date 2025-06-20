//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventario inventario=new Inventario();
        Producto p1=new Producto();
        p1.setCodigo("001");
        p1.setNombre("Lapiz");
        p1.setCantidad(5);
        Producto p2=new Producto();
        p2.setCodigo("002");
        p2.setNombre("Pluma");
        p2.setCantidad(3);
        Producto p3=new Producto();
        p3.setCodigo("003");
        p3.setNombre("Goma");
        p3.setCantidad(5);
        Producto p4=new Producto();
        p4.setCodigo("004");
        p4.setNombre("Regla");
        p4.setCantidad(7);

        //Agregar productos
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        System.out.println("Total items de los productos agregados: " + inventario.totalItems());

        //Buscar uno existente y uno no encontrado
        System.out.println("Buscar producto existente: " + (inventario.buscar("001") != null));
        System.out.println("Buscar producto inexistente: " + (inventario.buscar("004") != null));

        //elimininar
        inventario.eliminarProducto("002");
        System.out.println("Total items tras eliminar el producto: "+ inventario.totalItems());

        //Agregar nuevamente
        inventario.agregarProducto(p2);
        System.out.println("Total items tras agregar nuevamente el producto: "+ inventario.totalItems());
    }
}