
package lx.gs.jade;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CSummonRole__ extends xio.Protocol { }

/** 召唤猎取师
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSummonRole extends __CSummonRole__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6565169;

	public int getType() {
		return 6565169;
	}

	public int role; // 猎取师档位

	public CSummonRole() {
	}

	public CSummonRole(int _role_) {
		this.role = _role_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(role);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		role = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSummonRole) {
			CSummonRole _o_ = (CSummonRole)_o1_;
			if (role != _o_.role) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += role;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(role).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSummonRole _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = role - _o_.role;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

