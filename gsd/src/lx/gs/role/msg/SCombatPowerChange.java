
package lx.gs.role.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __SCombatPowerChange__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SCombatPowerChange extends __SCombatPowerChange__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6573613;

	public int getType() {
		return 6573613;
	}

	public int combatpower;

	public SCombatPowerChange() {
	}

	public SCombatPowerChange(int _combatpower_) {
		this.combatpower = _combatpower_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(combatpower);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		combatpower = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SCombatPowerChange) {
			SCombatPowerChange _o_ = (SCombatPowerChange)_o1_;
			if (combatpower != _o_.combatpower) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += combatpower;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(combatpower).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SCombatPowerChange _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = combatpower - _o_.combatpower;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

