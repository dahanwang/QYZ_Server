
package lx.gs.family.msg;

import lx.gs.family.PGetFamilyInfo;

import com.goldhuman.Common.Marshal.MarshalException;
import com.goldhuman.Common.Marshal.OctetsStream;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CGetFamilyInfo__ extends xio.Protocol { }

/** 获取家族信息,此协议返回数据比较多
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetFamilyInfo extends __CGetFamilyInfo__ {
	@Override
	protected void process() {
		new PGetFamilyInfo(this).validateRoleidAndExecute();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6563928;

	public int getType() {
		return 6563928;
	}


	public CGetFamilyInfo() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetFamilyInfo) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetFamilyInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

