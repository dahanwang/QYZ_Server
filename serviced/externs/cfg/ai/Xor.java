package cfg.ai;
public final class Xor extends cfg.ai.BoolExpr {
	public final static int TYPEID = -2079939009;
	final public int getTypeId() { return TYPEID; }
	public final cfg.ai.BoolExpr condition1;
	public final cfg.ai.BoolExpr condition2;
	public Xor(cfg.DataStream fs) {
		super(fs);
		this.condition1 = (cfg.ai.BoolExpr)fs.getObject(fs.getString());
		this.condition2 = (cfg.ai.BoolExpr)fs.getObject(fs.getString());
	}
}