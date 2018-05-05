
package lx.gs.map.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CGetDailyBestRecord__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetDailyBestRecord extends __CGetDailyBestRecord__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6579486;

	public int getType() {
		return 6579486;
	}

	public int ectypetype;

	public CGetDailyBestRecord() {
	}

	public CGetDailyBestRecord(int _ectypetype_) {
		this.ectypetype = _ectypetype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(ectypetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		ectypetype = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetDailyBestRecord) {
			CGetDailyBestRecord _o_ = (CGetDailyBestRecord)_o1_;
			if (ectypetype != _o_.ectypetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += ectypetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(ectypetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetDailyBestRecord _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = ectypetype - _o_.ectypetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

