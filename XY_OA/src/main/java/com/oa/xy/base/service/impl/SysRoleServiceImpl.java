package com.oa.xy.base.service.impl;

import com.oa.xy.base.entiy.SysRole;
import com.oa.xy.base.repository.SysRoleRepostory;
import com.oa.xy.base.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Chen's
 * @date 2019/8/2 15:57
 */
@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {
  @Autowired SysRoleRepostory sysRoleRepostory;

  @Override
  public SysRole save(SysRole sysRole) {
    return sysRoleRepostory.save(sysRole);
  }

  @Override
  public void deleteById(String roleId) {
    sysRoleRepostory.deleteById(roleId);
  }

  @Override
  public Page<SysRole> findAll(Pageable pageable) {
    return sysRoleRepostory.findAll(pageable);
  }

  @Override
  public Page<SysRole> findAll(Specification specification, Pageable pageable) {
    return sysRoleRepostory.findAll(specification, pageable);
  }

  @Override
  public List<SysRole> findAll() {
    return sysRoleRepostory.findAll();
  }

  @Override
  public List<SysRole> findAll(Sort sort) {
    return sysRoleRepostory.findAll(sort);
  }

  @Override
  public List<SysRole> findAll(Specification specification, Sort sort) {
    return sysRoleRepostory.findAll(specification, sort);
  }

  @Override
  public SysRole findByRoleCode(String roleCode) {
    return sysRoleRepostory.findByRoleCode(roleCode);
  }
}
