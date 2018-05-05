
package lx.gs.map.msg;

import com.goldhuman.Common.Marshal.MarshalException;
import com.goldhuman.Common.Marshal.OctetsStream;
import lx.gs.map.guardtower.PGuardTowerMatchStart;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CGuardTowerMatchStart__ extends xio.Protocol { }

/** 血战青云
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGuardTowerMatchStart extends __CGuardTowerMatchStart__ {
    @Override
    protected void process() {
		new PGuardTowerMatchStart(this).validateRoleidAndExecute();
    }

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6572889;

	public int getType() {
		return 6572889;
	}

	public int minpower;

	public CGuardTowerMatchStart() {
	}

	public CGuardTowerMatchStart(int _minpower_) {
		this.minpower = _minpower_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(minpower);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		minpower = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGuardTowerMatchStart) {
			CGuardTowerMatchStart _o_ = (CGuardTowerMatchStart)_o1_;
			if (minpower != _o_.minpower) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += minpower;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(minpower).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGuardTowerMatchStart _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = minpower - _o_.minpower;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

