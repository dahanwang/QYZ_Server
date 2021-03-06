
package lx.gs.pet.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;
import gs.AProcedure;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __SUpgradePetStar__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SUpgradePetStar extends __SUpgradePetStar__ {
	@Override
	protected void process() {
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6572557;

	public int getType() {
		return 6572557;
	}

	public int modelid;
	public int starlevel;

	public SUpgradePetStar() {
	}

	public SUpgradePetStar(int _modelid_, int _starlevel_) {
		this.modelid = _modelid_;
		this.starlevel = _starlevel_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(modelid);
		_os_.marshal(starlevel);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		modelid = _os_.unmarshal_int();
		starlevel = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SUpgradePetStar) {
			SUpgradePetStar _o_ = (SUpgradePetStar)_o1_;
			if (modelid != _o_.modelid) return false;
			if (starlevel != _o_.starlevel) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += modelid;
		_h_ += starlevel;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(modelid).append(",");
		_sb_.append(starlevel).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SUpgradePetStar _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = modelid - _o_.modelid;
		if (0 != _c_) return _c_;
		_c_ = starlevel - _o_.starlevel;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

