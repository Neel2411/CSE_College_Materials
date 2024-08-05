//Practical-5(1)
class CPU
{
    double price;
    CPU(double p)
    {
        price = p;
    }
    class Processor
    {
        double cores;
        String manufacturer;
        Processor(double c,String m)
        {
            cores = c;
            manufacturer = m;
        }
        double getCache() {
            return 256;
        }
        void displayProcessorDetails()
        {
            System.out.println("The Processor Has "+cores+" Cores");
            System.out.println("The Manufacturer Of Processor Is : "+manufacturer);
        }
    }
    protected class RAM
    {
        double memory;
        String manufacturer;
        double clockSpeed;
        RAM(double m,String n)
        {
            memory = m;
            manufacturer = n;
        }
        double getClockSpeed()
        {
            clockSpeed = 4.2;
            return clockSpeed;
        }
        void displayRAMDetail()
        {
            System.out.println("The RAM Memory Is : "+memory+"G.B");
            System.out.println("The Manufacturer Of RAM Is : "+manufacturer);
        }
    }
}
class Demo1
{
    public static void main (String [] args)
    {
        CPU c = new CPU(35000);
        CPU.Processor p = c.new Processor(8,"LENOVO");
        CPU.RAM r = c.new RAM(8,"KINGSTON");
        System.out.println("The Processor Cache Is : "+p.getCache()+"K.B");
        p.displayProcessorDetails();
        System.out.println("The RAM CLock Speed Is : "+r.getClockSpeed()+"Hz");
        r.displayRAMDetail();
    }
}