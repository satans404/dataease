import request from '@/utils/request'

/* export function saveShare(data) {
  return request({
    url: '/api/share/',
    method: 'post',
    loading: true,
    data
  })
} */
// 分享文件夹
export function shareFolder(data) {
  return request({
    url: '/api/share/bulkShare',
    method: 'post',
    data
  })
}

export function shareTargets(panelId) {
  return request({
    url: '/api/share/queryTargets/' + panelId,
    method: 'post',
    loading: true
  })
}

export function removeShares(data) {
  return request({
    url: '/api/share/removeShares/',
    method: 'post',
    loading: true,
    data
  })
}

export function loadShares(data) {
  return request({
    url: '/api/share/queryWithResourceId',
    method: 'post',
    loading: true,
    data
  })
}

export function loadTree(data) {
  return request({
    url: '/api/share/treeList',
    method: 'post',
    loading: true,
    data
  })
}

export function loadShareOutTree() {
  return request({
    url: '/api/share/shareOut',
    method: 'post',
    loading: true
  })
}

export function fineSave(data) {
  return request({
    url: '/api/share/fineSave',
    method: 'post',
    loading: true,
    data
  })
}

