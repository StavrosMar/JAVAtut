package ExecutionTT;

public class AbstractvsInterfaceClass {
	
	// Class Field to assist with fields like velocity etc.
	public class Field {
		
		private Double[] sinist = new Double[3];
		
		public Field(Double a,Double b,Double c ) {
			
			sinist[0] = a;
			sinist[1] = a;
			sinist[2] = a;
			
		}
		public Double x() {
			return this.sinist[0];			
		}
		
		public Double y() {
			return this.sinist[1];			
		}
		
		public Double z() {
			return this.sinist[1];			
		}
		
		public Field multiply(Field p) {
			Field result = new Field(this.x()*p.x(),this.y()*p.y(),this.z()*p.z());
			return result;
		}
		
	}
	
	//Interface
	
	public interface Turb_Int_l0 {
		
		public Double calcDensity();
		
	}
	
	//Interface 
	public interface Turb_Int extends Turb_Int_l0 {
		
		public void calcReynolds(Double velocity);
		
	}
	
	// Abstract - High level class for turbulence model
	abstract public class AbstractTurb implements Turb_Int {
		
		Double reynolds = new Double(0);
		Double viscosity = new Double(0);
		Double density =  new Double(0);
		
		public void calcReynolds(Double velocity) {
			this.reynolds = density*velocity/viscosity ;	
		}
		
		public abstract Field calculateDerivs(Field vec,  Field point );
	}
	
	//Derived Class from Abstract
	public class SpalartAlmaras extends AbstractTurb implements Turb_Int_l0  {
		
		Double const1 = new Double(0);
		Double const2 = new Double(0);
		//Vector Derivatives = new VectorField();
		
		public Field calculateDerivs(Field vel, Field point ) {
			
			// Do calculations...... - random for now
			return vel.multiply(point);
		}
		
		public Double calcDensity() {
			
			// Do calculations...... - random for now
			return 1.2;
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("Running AbstractvsInterfaceClass");
	
		/*Not possible - cannot create objects of interface - it would not make sense either as declarations are not there
		Turb_Int lola = new Turb_Int();*/
		
		//I need to declare an outer class instance to be able to create a SpalartAlmaras instance because this method is static
		AbstractvsInterfaceClass instance = new AbstractvsInterfaceClass();
		Turb_Int turb1 = instance.new SpalartAlmaras();
		
		/* Not possible because all i know is i am looking into a Turb_Int ref, i.e. only these functions are accessible.
	  	//turb1.calculateDerivs(); */
	
		// Possible because interface inheritance works
		turb1.calcDensity(); 
	}
}


