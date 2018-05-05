
package lx.gs.map.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __SChangeAttackCityStage__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SChangeAttackCityStage extends __SChangeAttackCityStage__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6578955;

	public int getType() {
		return 6578955;
	}

	public int stage; // cfg.ectype.AttackCityStage

	public SChangeAttackCityStage() {
	}

	public SChangeAttackCityStage(int _stage_) {
		this.stage = _stage_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(stage);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		stage = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SChangeAttackCityStage) {
			SChangeAttackCityStage _o_ = (SChangeAttackCityStage)_o1_;
			if (stage != _o_.stage) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += stage;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(stage).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SChangeAttackCityStage _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = stage - _o_.stage;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

